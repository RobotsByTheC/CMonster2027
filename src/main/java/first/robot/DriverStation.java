package first.robot;

import static first.robot.Constants.Control.*;

import org.wpilib.command3.button.CommandJoystick;
import org.wpilib.command3.button.CommandXboxController;

public class DriverStation {
  private final CommandJoystick leftFlightStick;
  private final CommandJoystick rightFlightStick;
  private final CommandXboxController controller;

  public DriverStation() {
    leftFlightStick = new CommandJoystick(LEFT_JOYSTICK_PORT);
    rightFlightStick = new CommandJoystick(RIGHT_JOYSTICK_PORT);
    controller = new CommandXboxController(CONTROLLER_PORT);
  }

  public double getLeftX() {
    return leftFlightStick.getX();
  }
  public double getLeftY() {
    return leftFlightStick.getY();
  }
  public double getRightX() {
    return rightFlightStick.getX();
  }
  public double getRightY() {
    return rightFlightStick.getY();
  }
  public CommandXboxController getController() {
    return controller;
  }
}