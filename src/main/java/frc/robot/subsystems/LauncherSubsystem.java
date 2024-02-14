package frc.robot.subsystems;

import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class LauncherSubsystem extends SubsystemBase {

    Spark topMotor = new Spark(Constants.pwmTopLauncher);
    Spark bottomMotor = new Spark(Constants.pwmBottomLauncher);

    MotorControllerGroup launcherMotors = new MotorControllerGroup(topMotor, bottomMotor);
    
    public LauncherSubsystem() {
        
    }
    
    public void SpeakerLaunch() {
        launcherMotors.set(1);
    }
    
    public void AmpLaunch() {
        launcherMotors.set(0.5);
    }
    
    public void Load() {
        launcherMotors.set(-0.5);
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run during simulation

    }
}