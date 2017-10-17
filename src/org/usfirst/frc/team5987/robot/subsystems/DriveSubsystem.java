package org.usfirst.frc.team5987.robot.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Victor Motor = new Victor(1);
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public DriveSubsystem() {
    	Motor.setExpiration(0.05);
    }
    
    public void setSpeed(double speed) {
    	Motor.set(speed);
    }
}

