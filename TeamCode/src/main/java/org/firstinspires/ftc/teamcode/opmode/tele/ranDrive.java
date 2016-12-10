package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.config.DriveOnly;

import java.util.Random;

@TeleOp(name = "Random", group = "pointless")
public class ranDrive extends LinearOpMode {

    Random r = new Random();
    DriveOnly dobot = new DriveOnly();
    boolean neg = true;

    @Override
    public void runOpMode() throws InterruptedException {

        dobot.init(hardwareMap);

        while(opModeIsActive()) {

            if(neg) {

                dobot.ld.setPower(-((r.nextInt(20) + 1)-10)*.1);

                neg = false;

            } else {

                dobot.ld.setPower(((r.nextInt(20) + 1)-10)*.1);

                neg = true;

            }

        }

    }

}
