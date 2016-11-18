package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import java.io.IOException;
import android.hardware.Camera;
import org.firstinspires.ftc.robotcontroller.internal.RobotMountedCameraSystemThatTakesPicturesOfThings;

@TeleOp(name="cTest", group="Specific")
public class CameraTest extends OpMode {

    public Camera c = null;

    @Override
    public void init() {


        RobotMountedCameraSystemThatTakesPicturesOfThings.cOpen(c);

    }

    @Override
    public void init_loop() {

    }

    @Override
    public void start() {

    }

    @Override
    public void loop() {

        if(gamepad1.a) {

            RobotMountedCameraSystemThatTakesPicturesOfThings.cPicture(c);

        }

    }

    @Override
    public void stop() {

        RobotMountedCameraSystemThatTakesPicturesOfThings.cClose(c);

    }

}
