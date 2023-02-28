// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Actuator;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class ActuatorFullRetract extends InstantCommand {
  public ActuatorFullRetract(Actuator mActuator) {
    // Use addRequirements() here to declare subsystem dependencies.
    //fully extend the actuators
    System.out.println("actuator fully extended");
    if(RobotContainer.m_actuator.HandActuatorPos > -1){
      RobotContainer.m_actuator.HandActuatorPos = -1;
     }
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}
}
