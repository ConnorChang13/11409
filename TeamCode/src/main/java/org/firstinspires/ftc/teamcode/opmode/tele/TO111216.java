package org.firstinspires.ftc.teamcode.opmode.tele;

import android.hardware.Camera;
import android.util.Log;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.HardwareMap;
import org.firstinspires.ftc.teamcode.config.RC111216;

@TeleOp(name = "TO111216", group = "General")
public class TO111216 extends OpMode {

    RC111216 dobot = new RC111216();

    @Override
    public void init() {

        telemetry.addData("STAT", "init");
        dobot.init(hardwareMap);

    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
    }

    @Override
    public void loop() {

        /*
        float l = gamepad1.left_stick_y;
        float r = gamepad1.right_stick_y;
        float f = gamepad2.left_stick_y;
        float f0 = gamepad2.right_stick_y;
        float b = gamepad2.right_trigger;
        */

        dobot.ld.setPower(-gamepad1.left_stick_y);
        dobot.rd.setPower(gamepad1.right_stick_y);
        dobot.f1.setPower(gamepad2.left_stick_y);
        dobot.f2.setPower(gamepad2.right_stick_y);

        if(gamepad2.right_trigger >= .25) {

            dobot.bu.setPower(gamepad2.right_trigger);

        }
        else {

            if(gamepad2.left_trigger >= .25) {

                dobot.bu.setPower(-gamepad2.left_trigger);

            }
            else {

                dobot.bu.setPower(0);

            }

        }

        /*

        if(dobot.ld.getPower() > 0) {

            Log.i("dobot", "Left Drive is at " + dobot.ld.getPower());
            telemetry.addData("leftDrive", "" + dobot.ld.getPower());

        }
        else {

            telemetry.addData("leftDrive", "" + dobot.ld.getPower());

        }

        if(dobot.rd.getPower() > 0) {

            Log.i("dobot", "Right Drive is at " + dobot.rd.getPower());
            telemetry.addData("rightDrive", "" + dobot.rd.getPower());

        }
        else {

            telemetry.addData("rightDrive", "" + dobot.rd.getPower());

        }

        if(dobot.f1.getPower() > 0) {

            Log.i("dobot", "Fork One is at " + dobot.f1.getPower());
            telemetry.addData("forkOne", "" + dobot.f1.getPower());

        }
        else {

            telemetry.addData("forkOne", "" + dobot.f1.getPower());

        }

        if(dobot.f2.getPower() > 0) {

            Log.i("dobot", "Fork Two is at " + dobot.f2.getPower());
            telemetry.addData("forkTwo", "" + dobot.f2.getPower());

        }
        else {

            telemetry.addData("forkTwo", "" + dobot.f2.getPower());

        }

        if(dobot.bu.getPower() > 0) {

            Log.i("dobot", "Bumper is at " + dobot.bu.getPower());
            telemetry.addData("bumper", "" + dobot.bu.getPower());

        }
        else {

            telemetry.addData("bumper", "" + dobot.bu.getPower());

        }
        */

    }

    @Override
    public void stop() {

        telemetry.addData("STAT", "dead");

    }

}
