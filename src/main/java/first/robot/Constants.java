package first.robot;

import com.ctre.phoenix6.CANBus;

public class Constants {
  public static class DeviceIDs {
    public static final CANBus CAN_BUS = new CANBus();

    public static final int LEFT_JOYSTICK_PORT = 0;
    public static final int RIGHT_JOYSTICK_PORT = 1;
    public static final int CONTROLLER_PORT = 2;
    public static final int GYRO_DEVICE_ID = 3;
  }
}