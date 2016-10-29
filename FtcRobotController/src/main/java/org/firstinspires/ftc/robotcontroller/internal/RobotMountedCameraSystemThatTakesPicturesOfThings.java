package org.firstinspires.ftc.robotcontroller.internal;

import android.hardware.Camera;
import android.util.Log;
import android.view.SurfaceHolder;

import java.io.IOException;

public class RobotMountedCameraSystemThatTakesPicturesOfThings {

    public static SurfaceHolder sh = null;

    public static void cOpen(Camera cam) {

        cam = Camera.open(0);
        Log.i("C3", "Camera is open");
        try { cam.setPreviewDisplay(sh); } catch(IOException e) {}
    }

    public static void cPicture(Camera cam) {

        cam.takePicture(null, null, null);
        Log.i("C3", "Camera took a picture");

    }

    public static void cClose(Camera cam) {

        cam.release();
        Log.i("C3", "Camera is released");

        if(cam == Camera.open()) {

            Log.e("C3", "For whatever reason, your garbage camera isn't released");

        }

    }

}
