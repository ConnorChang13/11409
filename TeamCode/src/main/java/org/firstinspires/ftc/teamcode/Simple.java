package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.Range;

@TeleOp(name = "Simple", group = "Tests")
@Disabled
public class Simple extends OpMode {

    DcMotor leftDrive = hardwareMap.dcMotor.get("leftDrive");
    DcMotor rightDrive = hardwareMap.dcMotor.get("rightDrive");

    float y1;
    float y2;

    @Override
    public void init() {



    }

    @Override
    public void loop() {

        y1 = -gamepad1.left_stick_y;
        y2 = -gamepad1.right_stick_y;

        y1 = Range.clip(y1, 1, -1);
        y2 = Range.clip(y2, 1, -1);

        leftDrive.setPower(y1);
        rightDrive.setPower(y2);

    }

}
