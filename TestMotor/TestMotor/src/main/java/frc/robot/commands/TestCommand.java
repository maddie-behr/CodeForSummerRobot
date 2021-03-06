// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import frc.robot.subsystems.TestMotor;
import edu.wpi.first.wpilibj2.command.CommandBase;
public class TestCommand extends CommandBase {
  private TestMotor testMotor;
  private double power; 

  /** Creates a new TestCommand. */
  public TestCommand(TestMotor testMotor,double power) {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(testMotor);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    testMotor.setPower(power);
    System.out.println("Runnning Motor");
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    testMotor.setPower(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
