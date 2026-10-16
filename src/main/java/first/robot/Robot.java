// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package first.robot;

import first.robot.dashboard.DevicePinger;
import org.wpilib.command3.Scheduler;
import org.wpilib.driverstation.DriverStation;
import org.wpilib.epilogue.Epilogue;
import org.wpilib.epilogue.Logged;
import org.wpilib.framework.TimedRobot;
import org.wpilib.system.DataLogManager;

@Logged
public class Robot extends TimedRobot {
  private final DriverStationDevice driverStationDevice;

  public Robot() {
    DevicePinger.create();
    DataLogManager.start();
    driverStationDevice = new DriverStationDevice();

    DevicePinger.finalizeDeviceConnectionList();
    DriverStation.startDataLog(DataLogManager.getLog(), false);
  }



  @Override
  public void robotPeriodic() {
    Scheduler.getDefault().run();
    Epilogue.update(this);
    DevicePinger.periodicUpdate();
  }
}
