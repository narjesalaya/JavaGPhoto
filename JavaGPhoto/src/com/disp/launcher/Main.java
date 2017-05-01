package com.disp.launcher;

import java.io.File;
import java.io.IOException;

import org.gphoto2.Camera;
import org.gphoto2.CameraFile;
import org.gphoto2.CameraList;
import org.gphoto2.CameraUtils;

public class Main {

	private static Camera c;

	/**
	 * here you can try the API features
	 *  Principle : 
	 *   (1) declare camera 
	 *   (2) initialze 
	 *   (3) capture 
	 *   (4) save the captured image
	 *   
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		final Camera c = new Camera();
		c.initialize();
		CameraFile cf2 = c.captureImage();
		cf2.save(new File("captured.jpg").getAbsolutePath());
		c.deinitialize();
		CameraUtils.closeQuietly(cf2);
		CameraUtils.closeQuietly(c);
	}

}
