package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/*

COMPLIANT WITH:

simple

 */

public class DriveOnly {

    // DEFINITIONS //

    public DcMotor ld = null;
    public DcMotor rd = null;

    HardwareMap hm = null;
    private ElapsedTime e = new ElapsedTime();

    // CONSTRUCTOR //

    public DriveOnly() { }

    public void init(HardwareMap hm) {

        // FINDING THE MOTORS //

        ld = hm.dcMotor.get("leftDrive");
        rd = hm.dcMotor.get("rightDrive");

        ld.setPower(0);
        rd.setPower(0);

        ld.setDirection(DcMotorSimple.Direction.FORWARD);
        rd.setDirection(DcMotorSimple.Direction.REVERSE);

    }

}
