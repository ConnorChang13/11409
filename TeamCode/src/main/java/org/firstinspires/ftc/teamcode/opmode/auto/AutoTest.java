package org.firstinspires.ftc.teamcode.opmode.auto;

import com.qualcomm.robotcore.eventloop.opmode.*;

import org.firstinspires.ftc.teamcode.RobotConfig.ForkliftConfig;

@Autonomous(name = "AutoTest", group = "Auto")
public class AutoTest extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {

        ForkliftConfig dobot = new ForkliftConfig();

        for(int i=0;i<11;i++) {

            telemetry.addData("STATUS", "spinning right");
            dobot.ld.setPower(1);
            dobot.rd.setPower(-1);
            Thread.sleep(1000);

            telemetry.addData("STATUS", "spinning left");
            dobot.ld.setPower(-1);
            dobot.rd.setPower(1);
            Thread.sleep(1000);

        }

        dobot.ld.setPower(0);
        dobot.rd.setPower(0);
        Thread.sleep(5000);

        for(int i=0;i<11;i++) {

            dobot.ld.setPower(1);
            dobot.rd.setPower(1);
            Thread.sleep(500);
            telemetry.addData("STATUS", "moving forward");
            dobot.ld.setPower(-1);
            dobot.rd.setPower(-1);
            Thread.sleep(500);
            telemetry.addData("STATUS", "moving backward");

        }

    }

}
