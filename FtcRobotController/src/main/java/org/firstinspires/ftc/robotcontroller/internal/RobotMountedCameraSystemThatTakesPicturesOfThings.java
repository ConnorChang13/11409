package org.firstinspires.ftc.robotcontroller.internal;

import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.hardware.Camera;
import android.util.Log;
import android.webkit.WebView;

public class RobotMountedCameraSystemThatTakesPicturesOfThings {

    public static void cOpen(Camera cam) {

        cam = Camera.open(0);
        Log.i("Connor's Crappy Camera", "Camera is open");

    }

    public static void cPicture(Camera cam, Camera.ShutterCallback shut, Camera.PictureCallback pict1, Camera.PictureCallback pict2) {

        cam.takePicture(shut, pict1, pict2);
        Log.i("Connor's Crappy Camera", "Camera took a picture");

    }

    public static void cClose(Camera cam) {

        cam.release();
        Log.i("Connor's Crappy Camera", "Camera is released");

        if(cam == Camera.open()) {

            Log.e("Connor's Crappy Camera", "For whatever reason, your garbage camera isn't released");

        }

    }

}
