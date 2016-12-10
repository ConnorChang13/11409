package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

/**
 * Created by ckc on 11/19/2016.
 */
public class Nov19c {

    public static DcMotor ld;
    public static DcMotor rd;
    public static DcMotor f1;
    public static DcMotor f2;
    public static DcMotor c1;
    public static DcMotor c2;
    public static DcMotor c3;
    public static DcMotor c4;
    public static Servo   bu;

    public Nov19c() { }

    public void init(HardwareMap hm) {

        ld = hm.dcMotor.get("leftDrive");ld.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        rd = hm.dcMotor.get("rightDrive");rd.setPower(0);ld.setDirection(DcMotorSimple.Direction.REVERSE);
        f1 = hm.dcMotor.get("forkOne");f1.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        f2 = hm.dcMotor.get("forkTwo");f2.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        c1 = hm.dcMotor.get("cannonOneA");c1.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        c2 = hm.dcMotor.get("cannonOneB");c2.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        c3 = hm.dcMotor.get("cannonTwoA");c3.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        c4 = hm.dcMotor.get("cannonTwoB");c4.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        bu = hm.servo.get("bumper");bu.setPosition(0);bu.setDirection(Servo.Direction.FORWARD);

    }

    public static void cPower(float power) {

        c1.setPower(power);c2.setPower(power);c3.setPower(power);c4.setPower(power);

    }

}
