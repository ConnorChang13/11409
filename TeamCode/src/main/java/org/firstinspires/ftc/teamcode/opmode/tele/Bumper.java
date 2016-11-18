package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.*;

import org.firstinspires.ftc.teamcode.config.*;

@TeleOp(name = "Bumper", group = "Specific")
public class Bumper extends OpMode {

    ForkliftYBumperConfig dobot = new ForkliftYBumperConfig();

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

        if(gamepad1.right_trigger >= 0.75) {

            //up

            dobot.bu.setPower(1);

        }
        else if(gamepad1.left_trigger >= 0.75) {

            //down

            dobot.bu.setPower(-0.75);

        }
        else {

            dobot.bu.setPower(0);

        }

    }

    @Override
    public void stop() {

        telemetry.addData("STAT", "dead");

    }

}
