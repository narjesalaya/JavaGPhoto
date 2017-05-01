package com.disp.launcher;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LauncherMain {

	public static void main(String[] args) {

		LauncherMain obj = new LauncherMain();

		String pathBatch = "batch.sh";
		
		//in mac oxs
		String command = "sudo " + "gphoto2 --auto-detect && gphoto2 --capture-image-and-download"; 

	
		String output = obj.executeCommand(command);

		System.out.println(output);

	}

	private String executeCommand(String command) {

		StringBuffer output = new StringBuffer();

		Process p;
		try {
			p = Runtime.getRuntime().exec(command);
			p.waitFor();
			BufferedReader reader =
                            new BufferedReader(new InputStreamReader(p.getInputStream()));

                        String line = "";
			while ((line = reader.readLine())!= null) {
				output.append(line + "\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return output.toString();

	}

}
