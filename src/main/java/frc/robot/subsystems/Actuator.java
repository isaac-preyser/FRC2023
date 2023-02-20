// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotContainer;

public class Actuator extends SubsystemBase {
  /** Creates a new Actuator. */
  Spark Actuator = new Spark(4);
  public double ActuatorPos = 1.0;
  public Actuator() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    Actuator.set(ActuatorPos);
  }
}

