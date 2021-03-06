// We were having some trouble resetting our encoders through methods in other op modes, so we created this one.
// Reset Encoders resets the drivetrain's encoders. That's it.

package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotorController;

public class ResetEncoders extends LinearBase
{
	@Override
	public void runOpMode() throws InterruptedException
	{
		mapHardware();
		drivetrainSetMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
		waitForStart();
		resetEncoders();
	}
}