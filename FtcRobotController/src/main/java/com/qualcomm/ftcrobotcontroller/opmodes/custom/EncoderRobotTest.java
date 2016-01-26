package com.qualcomm.ftcrobotcontroller.opmodes.custom;

import com.qualcomm.robotcore.hardware.DcMotorController;
import com.qualcomm.robotcore.util.ElapsedTime;

/**
 * Created by RoboticsClub on 12/9/2015.
 */
public class EncoderRobotTest extends LinearBase
{
	ElapsedTime clock = new ElapsedTime();

	//final int     SMOOTH_LENGTH         = 10    ;
	final boolean TELEMETRY             = true  ; //enables/disables telemetry
	final double TICKS_PER_DEGREE       = 2900/90.0 ;
	final double TICKS_PER_INCH         = 1000/6.375;

	int step = 0;

	//double lastXLeft [] = new double[SMOOTH_LENGTH];
	//double lastXRight[] = new double[SMOOTH_LENGTH];

	public void runOpMode()
	{
		mapHardware();

		drivetrainSetMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
		drivetrainSetMode(DcMotorController.RunMode.RUN_TO_POSITION   );

		driveRight.setTargetPosition(1440);
		driveLeft.setTargetPosition(1440);

		telemetry.addData("Encoder Values", driveRight.getCurrentPosition()+", "+driveLeft.getCurrentPosition());

		driveRight.setPower(0.8);
		driveLeft.setPower(0.8);
	}
}
