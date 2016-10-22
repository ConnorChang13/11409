/*
Copyright (c) 2016 Robert Atkinson

All rights reserved.

Redistribution and use in source and binary forms, with or without modification,
are permitted (subject to the limitations in the disclaimer below) provided that
the following conditions are met:

Redistributions of source code must retain the above copyright notice, this list
of conditions and the following disclaimer.

Redistributions in binary form must reproduce the above copyright notice, this
list of conditions and the following disclaimer in the documentation and/or
other materials provided with the distribution.

Neither the name of Robert Atkinson nor the names of his contributors may be used to
endorse or promote products derived from this software without specific prior
written permission.

NO EXPRESS OR IMPLIED LICENSES TO ANY PARTY'S PATENT RIGHTS ARE GRANTED BY THIS
LICENSE. THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESSFOR A PARTICULAR PURPOSE
ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE
FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
package org.firstinspires.ftc.teamcode.opmode.tele;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.teamcode.RobotConfig.ForkliftConfig;

@TeleOp(name="Forklift I", group="I")
public class Forklift extends OpMode {
    ForkliftConfig dobot = new ForkliftConfig();
    @Override
    public void init() {
        telemetry.addData("Status", "Initialized");
        dobot.init(hardwareMap);
    }
    @Override
    public void init_loop() {/*NONE*/}
    @Override
    public void start() {/*NONE*/}
    @Override
    public void loop() {
        float ly = gamepad1.left_stick_y;
        float ry = gamepad1.right_stick_y;
        boolean a = gamepad1.a;
        boolean b = gamepad1.b;
        double left = (double) ly * .75;
        double right = (double) ry * .75;
        dobot.ld.setPower(left);
        dobot.rd.setPower(right);
        if(a) {
            dobot.fl.setPower(.5);
            telemetry.addData("FORKLIFT", "UP");
        }
        else if(b) {
            dobot.fl.setPower(-.5);
            telemetry.addData("FORKLIFT", "DOWN");
        }
        else if(!a&&!b) {
            dobot.fl.setPower(0);
            telemetry.addData("FORKLIFT", "STATIONARY");
        }
    }
    @Override
    public void stop() {/*NONE*/}
}
