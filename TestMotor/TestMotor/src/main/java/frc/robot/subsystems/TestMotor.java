// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.TalonFXControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class TestMotor extends SubsystemBase {
  /** Creates a new TestMotor. */
  private WPI_TalonFX motor  = new WPI_TalonFX(Constants.DriveSubsystem.MOTOR_NUM);
  public TestMotor() {}
  public void setPower(double testPower){
    motor.set(TalonFXControlMode.PercentOutput, testPower);
  }
  @Override
  public void periodic() {
    
    // This method will be called once per scheduler run
  }
}
