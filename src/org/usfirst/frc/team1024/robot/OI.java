package org.usfirst.frc.team1024.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team1024.robot.commands.EncoderPID2;
import org.usfirst.frc.team1024.robot.commands.GyroEncoderPID;
import org.usfirst.frc.team1024.robot.commands.GyroPID;

public class OI {

	
	public static GyroEncoderPID autoDriveX = new GyroEncoderPID();
	public static GyroPID gyroPID = new GyroPID();
	public static EncoderPID2 encoderPID = new EncoderPID2();
	
	public Joystick driver = new Joystick(0);
	
	public JoystickButton autoDrive = new JoystickButton(driver, 1);
	public JoystickButton stopDrive = new JoystickButton(driver, 2);

	public OI() {
		
	}
	
	public void getOI(){
		autoDrive.whenPressed(autoDriveX);
		
		stopDrive.cancelWhenPressed(autoDriveX);
	}
}

