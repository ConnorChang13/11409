package org.firstinspires.ftc.teamcode.RobotConfig;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by ckc on 10/8/2016.
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

    }

}
