// DFFB = Dump from Floor, Far, Blue

package com.qualcomm.ftcrobotcontroller.opmodes.custom;

import com.qualcomm.robotcore.hardware.DcMotorController;

/**
 * Created by jackiehirsch on 12/14/15.
 */
public class DFFB extends LinearBase
{
	@Override
	public void runOpMode() throws InterruptedException
	{
		initalize();
		waitForStart();

		dropperBase.setPosition(0.518);   // Raise up the climber-dropper
		movePlow(0.75, 9500);             // Extend the plow
		moveEn((int)(8.5 * FT), 0.7); // Move 8.5 feet forwards
		//moveForward(FT, 0.7, 1000);
		//dropperBase.setPosition(0.1);   // Dump
		Thread.sleep(1000);
	}
}