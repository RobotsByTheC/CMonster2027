package first.robot.dashboard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BooleanSupplier;
import org.wpilib.system.DataLogManager;
import org.wpilib.telemetry.Telemetry;

public class DevicePinger {
  public record PingedDevice(BooleanSupplier connected, int id) {}
  private final List<PingedDevice> devices;
  private static DevicePinger INSTANCE;

  public DevicePinger() {
    devices = new ArrayList<>();
  }

  public static void create() {
    if (INSTANCE == null) {
      INSTANCE = new DevicePinger();
      DataLogManager.log("DevicePinger instance created.");
    } else {
      DataLogManager.log("WARNING: DevicePinger was attempted to be instantiated multiple times.");
    }
  }

  public static void finalizeDeviceConnectionList() {
    INSTANCE.devices.sort(Comparator.comparing(PingedDevice::id));
    DataLogManager.log("DevicePinger device connection list finalized with " + INSTANCE.devices.size() + " devices.");
    periodicUpdate();
  }

  public static void addDevice(BooleanSupplier supplier, int id) {
    INSTANCE.devices.add(new PingedDevice(supplier, id));
    DataLogManager.log("Device " + id + " added to DevicePinger.");
  }

  public static void periodicUpdate() {
    for (PingedDevice device : INSTANCE.devices) {
      Telemetry.log("device-"+device.id, device.connected.getAsBoolean());
    }
  }
}