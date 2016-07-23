// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2129.TestingThing2.subsystems;

import org.usfirst.frc2129.TestingThing2.Robot;
import org.usfirst.frc2129.TestingThing2.RobotMap;
import org.usfirst.frc2129.TestingThing2.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Subsystem1 extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController leftFront = RobotMap.subsystem1LeftFront;
    private final SpeedController rightFront = RobotMap.subsystem1RightFront;
    private final SpeedController leftBack = RobotMap.subsystem1LeftBack;
    private final SpeedController rightBack = RobotMap.subsystem1RightBack;
    private final RobotDrive robotDrive41 = RobotMap.subsystem1RobotDrive41;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        setDefaultCommand(new Drive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void drive ( double left, double right) {
    	Robot.subsystem1.robotDrive41.tankDrive(left, right);
    }
}

