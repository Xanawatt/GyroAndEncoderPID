package org.usfirst.frc.team1024.robot.commands;

import org.usfirst.frc.team1024.robot.OI;
import org.usfirst.frc.team1024.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class GyroEncoderPID extends CommandGroup {
    
    public GyroEncoderPID() {
    	requires(Robot.rightDriveAuto);
    	requires(Robot.leftDriveAuto);
    }
    protected void Intialize() {
    	
    }
    protected void Execute() {
    	addParallel(OI.gyroPID);
    }
    protected boolean isFinished() {
		return false;
    }
    protected void end() {
    	OI.gyroPID.end();
    	OI.encoderPID.end();
    }
}
