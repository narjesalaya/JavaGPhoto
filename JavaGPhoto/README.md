# GPhoto2 Java Bindings

Java bindings for Linux using gphoto/gphoto2 library 

## Example


```java
		final Camera c = new Camera();
		c.initialize();
		CameraFile cf2 = c.captureImage();
		cf2.save(new File("captured.jpg").getAbsolutePath());
		c.deinitialize();
		CameraUtils.closeQuietly(cf2);
		CameraUtils.closeQuietly(c);
```

## Reporting Bugs

narjes.alaya@gmail.com

