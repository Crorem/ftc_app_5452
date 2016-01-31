// DFFB = Drive to Floor, Far, Blue

package com.qualcomm.ftcrobotcontroller.opmodes;

public class DFFB extends LinearBase
{
	@Override
	public void runOpMode() throws InterruptedException
	{
		mapHardware();
		initalize();
		waitForStart();

		com.qualcomm.ftcrobotcontroller.opmodes.Global.ranAutonomous = true;
		dropperBase.setPosition(BASE_VERTICAL); // Raise up the climber-dropper
		movePlow(0.75, 9500);                   // Extend the plow
		moveEn((int)(8.5*FT), 0.7);            // Move 8.5 feet forwards
		//moveForward(FT, 0.7, 1000);
		//dropperBase.setPosition(0.1);         // Dump
		Thread.sleep(1000);
	}
}
