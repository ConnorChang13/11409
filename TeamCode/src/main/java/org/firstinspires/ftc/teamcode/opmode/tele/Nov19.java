package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.*;

import org.firstinspires.ftc.teamcode.config.*;

@TeleOp(name = "Nov19c", group = "all")
public class Nov19 extends OpMode {

    Nov19c dobot = new Nov19c();

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

        dobot.ld.setPower(gamepad1.left_stick_y);
        dobot.rd.setPower(gamepad1.right_stick_y);

        if(gamepad2.a) {

            Nov19c.cPower(1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else {

            Nov19c.cPower(0);

        }

        dobot.bu.setPosition(gamepad2.right_trigger);

    }

    @Override
    public void stop() { telemetry.addData("STAT", "dead");



    }

}
