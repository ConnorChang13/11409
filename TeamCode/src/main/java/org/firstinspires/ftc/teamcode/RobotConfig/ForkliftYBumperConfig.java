package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

public class ForkliftYBumperConfig {

    // DEFINITIONS //

    public DcMotor ld = null;
    public DcMotor rd = null;
    public DcMotor bu = null;
    public DcMotor fl = null;

    HardwareMap hm = null;

    // CONSTRUCTOR //

    public ForkliftYBumperConfig() { }

    public void init(HardwareMap hm) {

        ld = hm.dcMotor.get("leftDrive");ld.setPower(0);ld.setDirection(DcMotorSimple.Direction.FORWARD);
        rd = hm.dcMotor.get("rightDrive");rd.setPower(0);rd.setDirection(DcMotorSimple.Direction.REVERSE);
        fl = hm.dcMotor.get("forkLift");fl.setPower(0);fl.setDirection(DcMotorSimple.Direction.FORWARD);
        bu = hm.dcMotor.get("bumper");bu.setPower(0);bu.setDirection(DcMotorSimple.Direction.FORWARD);

    }

    public void bUp(DcMotor bumper) {

        bumper.setPower(1);
        try{

            Thread.sleep(400);

        }catch(InterruptedException e1){e1.printStackTrace();}

        bumper.setPower(0);

    }

    public void bDo(DcMotor bumper) {

        bumper.setPower(-1);
        try {
            Thread.sleep(400);
        } catch(InterruptedException e2) {
            e2.printStackTrace();
        }

    }

}
