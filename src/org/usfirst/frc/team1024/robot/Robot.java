
package org.usfirst.frc.team1024.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team1024.robot.commands.EncoderPID2;
import org.usfirst.frc.team1024.robot.subsystems.LeftDrive;
import org.usfirst.frc.team1024.robot.subsystems.RightDrive;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	public static OI driverControls;
	public static LeftDrive leftDriveAuto = new LeftDrive();
	public static RightDrive rightDriveAuto = new RightDrive();
	public EncoderPID2 encoderPID = new EncoderPID2();
	public Command GyroPID = new org.usfirst.frc.team1024.robot.commands.GyroPID();
    public void robotInit() {
    	driverControls = new OI();
    }
    public void disabledInit(){
    	leftDriveAuto.leftEncoder.reset();
    	rightDriveAuto.rightEncoder.reset();
    }
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
        leftDriveAuto.Dashboard();
        rightDriveAuto.Dashboard();
	}
    public void autonomousInit() {
    }
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }
    public void teleopInit() {
    	leftDriveAuto.leftEncoder.reset();
    	rightDriveAuto.rightEncoder.reset();
    }
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        driverControls.getOI();
        leftDriveAuto.Dashboard();
        rightDriveAuto.Dashboard();
    }
    public void testPeriodic() {
        LiveWindow.run();
    }
    public void doTheThing(){
    	encoderPID.setFeet(2);
    	encoderPID.start();
    }
}
