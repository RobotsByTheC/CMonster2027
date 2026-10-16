package first.robot.swerve;

import org.wpilib.math.geometry.Rotation2d;
import org.wpilib.math.kinematics.ChassisVelocities;
import org.wpilib.math.kinematics.SwerveModulePosition;

public interface SwerveIO {
  void stop();

  Rotation2d getRotation();

  void setGyro();

  void driveSpeeds(ChassisVelocities velocities);

  SwerveModulePosition[] getModulePositions();

  void setSwerveModulePositions(SwerveModulePosition[] modulePositions);
}