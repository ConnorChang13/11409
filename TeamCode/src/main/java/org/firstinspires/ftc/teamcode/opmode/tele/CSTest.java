package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.*;
import com.qualcomm.robotcore.hardware.ColorSensor;

@TeleOp(name = "CSTest", group = "Specific")
public class CSTest extends OpMode {

    ColorSensor cs;

    @Override
    public void init() {

        telemetry.addData("STAT", "init");
        cs = hardwareMap.colorSensor.get("colorSensor");
        cs.enableLed(true);

    }

    @Override
    public void init_loop() {
    }

    @Override
    public void start() {
    }

    @Override
    public void loop() {

        telemetry.addData("Red", cs.red());
        telemetry.addData("Green", cs.green());
        telemetry.addData("Blue", cs.blue());

    }

    @Override
    public void stop() {

        telemetry.addData("STAT", "dead");

    }

}
