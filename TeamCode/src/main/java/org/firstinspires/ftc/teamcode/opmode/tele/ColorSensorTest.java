package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

@TeleOp(name="Color Sensor", group="Specific")
public class ColorSensorTest extends OpMode {

    ColorSensor s = null;

    @Override
    public void init() {

        s = hardwareMap.colorSensor.get("colorSensor");

    }

    @Override
    public void loop() {

        float r = s.red();float g = s.green();float b = s.blue();
        boolean rb[]={false,false};if(r>b){rb[0]=true;rb[1]=false;}if(r<b){rb[1]=true;rb[0]=false;}
        telemetry.addData("Red",rb[0]?"On":"Off");telemetry.addData("Blue",rb[1]?"On":"Off");

    }

}
