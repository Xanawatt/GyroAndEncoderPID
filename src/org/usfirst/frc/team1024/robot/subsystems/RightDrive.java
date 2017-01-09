
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
public class RightDrive extends Subsystem implements PIDSource, PIDOutput{
	
	public VictorSP right = new VictorSP(RobotMap.rightDrivePWM);
    public Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB, false);
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
		return 0;
	}

	public void Dashboard() {
		SmartDashboard.putData("Right Encoder PID Values", pid);
		SmartDashboard.putNumber("Right Encoder Output", pidGet());
	}
}

