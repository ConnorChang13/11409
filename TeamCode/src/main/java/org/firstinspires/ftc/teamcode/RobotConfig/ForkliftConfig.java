package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/*

COMPLIANT WITH:

simple

 */

public class ForkliftConfig {

    // DEFINITIONS //

    public DcMotor ld = null;
    public DcMotor rd = null;

    public DcMotor fl = null;

    HardwareMap hm = null;
    private ElapsedTime e = new ElapsedTime();

    // CONSTRUCTOR //

    public ForkliftConfig() { }

    public void init(HardwareMap hm) {

        // FINDING THE MOTORS //

        ld = hm.dcMotor.get("leftDrive");
        rd = hm.dcMotor.get("rightDrive");
        fl = hm.dcMotor.get("forkLift");

        ld.setPower(0);
        rd.setPower(0);
        fl.setPower(0);

        ld.setDirection(DcMotorSimple.Direction.FORWARD);
        rd.setDirection(DcMotorSimple.Direction.REVERSE);
        fl.setDirection(DcMotorSimple.Direction.FORWARD);

    }

}
