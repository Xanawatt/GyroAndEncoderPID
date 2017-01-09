
package org.usfirst.frc.team1024.robot.subsystems;

import org.usfirst.frc.team1024.robot.RobotMap;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LeftDrive extends Subsystem implements PIDSource, PIDOutput{
	
	public VictorSP left = new VictorSP(RobotMap.rightDrivePWM);
    public Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB, false);
    public PIDController pid;
    
    public void initDefaultCommand() {
    }

	@Override
	public void pidWrite(double output) {
	}

	@Override
	public void setPIDSourceType(PIDSourceType pidSource) {
	}

	@Override
	public PIDSourceType getPIDSourceType() {
		return null;
	}

	@Override
	public double pidGet() {
		return leftEncoder.getDistance();
	}

	public void Dashboard() {
		SmartDashboard.putData("Left Encoder PID Values", pid);
		SmartDashboard.putNumber("Left Encoder PID Output", pidGet());
	}
}

