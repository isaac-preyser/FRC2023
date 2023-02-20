// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PowerDistribution;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.XboxController.Button;
import frc.robot.commands.ActuatorOut;
import frc.robot.commands.ActuatorRetract;
import frc.robot.commands.ActuatorStop;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.Actuator;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...

  public static PowerDistribution powerDist = new PowerDistribution(); //import PDP object. .


  //instantiate subsystems for the whole robot here 

  //code hehe
  public static XboxController controller = new XboxController(Constants.controllerPort); //instantiate new xbox controller


  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();

  public final static DriveSubsystem m_driveSubsystem = new DriveSubsystem();

  public final static Actuator m_actuator = new Actuator();

  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
  private final ActuatorOut m_ActuatorOut = new ActuatorOut(m_actuator);
  private final ActuatorStop  m_ActuatorStop = new ActuatorStop(m_actuator);
  private final ActuatorRetract m_ActuatorRetract = new ActuatorRetract(m_actuator);


  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    //configure THE BUTTONS
    new JoystickButton(controller, 2).whileTrue(m_ActuatorOut);
    new JoystickButton(controller, 3).whileTrue(m_ActuatorRetract);
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
