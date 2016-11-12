package org.firstinspires.ftc.teamcode.config;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class RC111216 {

    public DcMotor ld = null;
    public DcMotor rd = null;
    public DcMotor f1 = null;
    public DcMotor f2 = null;
    public DcMotor bu = null;
    HardwareMap h = null;
    public RC111216() { }

    public void init(HardwareMap h) {

        ld=h.dcMotor.get("leftDrive");ld.setDirection(DcMotorSimple.Direction.FORWARD);ld.setPower(0);
        rd=h.dcMotor.get("rightDrive");rd.setDirection(DcMotorSimple.Direction.FORWARD);rd.setPower(0);
        f1=h.dcMotor.get("forkOne");f1.setDirection(DcMotorSimple.Direction.FORWARD);f1.setPower(0);
        f2=h.dcMotor.get("forkTwo");f2.setDirection(DcMotorSimple.Direction.FORWARD);f2.setPower(0);
        bu=h.dcMotor.get("bumper");bu.setDirection(DcMotorSimple.Direction.FORWARD);bu.setPower(0);

    }

}
