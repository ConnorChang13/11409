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
    private ElapsedTime e = new ElapsedTime();

    // CONSTRUCTOR //

    public ForkliftYBumperConfig() { }

    public void init(HardwareMap hm) {

        // FINDING THE MOTORS //

        ld = hm.dcMotor.get("leftDrive");
        rd = hm.dcMotor.get("rightDrive");
        fl = hm.dcMotor.get("forkLift");
        bu = hm.dcMotor.get("bumper");

        ld.setPower(0);
        rd.setPower(0);
        fl.setPower(0);
        bu.setPower(0);

        ld.setDirection(DcMotorSimple.Direction.FORWARD);
        rd.setDirection(DcMotorSimple.Direction.REVERSE);
        fl.setDirection(DcMotorSimple.Direction.FORWARD);
        bu.setDirection(DcMotorSimple.Direction.FORWARD);

    }

    public void bUp(DcMotor bumper) {

        bumper.setPower(1);
        try {
            Thread.sleep(400);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
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
