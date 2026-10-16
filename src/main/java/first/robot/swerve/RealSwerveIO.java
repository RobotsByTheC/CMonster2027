package first.robot.swerve;

import static first.robot.Constants.DeviceIDs.*;

import com.ctre.phoenix6.hardware.Pigeon2;
import first.robot.dashboard.DevicePinger;
import org.wpilib.math.geometry.Rotation2d;
import org.wpilib.math.kinematics.ChassisVelocities;
import org.wpilib.math.kinematics.SwerveModulePosition;

public class RealSwerveIO implements SwerveIO {
  private final Pigeon2 gyro;

  public RealSwerveIO() {
    gyro = new Pigeon2(GYRO_DEVICE_ID, CAN_BUS);

    DevicePinger.addDevice(gyro::isConnected, GYRO_DEVICE_ID);
  }

  @Override
  public void stop() {

  }

  @Override
  public Rotation2d getRotation() {
    return null;
  }

  @Override
  public void setGyro() {

  }

  @Override
  public void driveSpeeds(ChassisVelocities velocities) {

  }

  @Override
  public SwerveModulePosition[] getModulePositions() {
    return new SwerveModulePosition[0];
  }

  @Override
  public void setSwerveModulePositions(SwerveModulePosition[] modulePositions) {

  }
}