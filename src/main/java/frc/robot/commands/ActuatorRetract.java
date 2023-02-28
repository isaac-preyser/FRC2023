// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Actuator;
import edu.wpi.first.wpilibj2.command.InstantCommand;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ActuatorRetract extends InstantCommand {
  public ActuatorRetract(Actuator mActuator) {
    // Use addRequirements() here to declare subsystem dependencies.
    System.out.println("actuator retracted");
    if(RobotContainer.m_actuator.HandActuatorPos > -1){
      RobotContainer.m_actuator.HandActuatorPos -= 0.1; 
     }
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {

  }
}
