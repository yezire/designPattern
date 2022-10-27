package command;

public class Main {

  public static void main(String[] args) {
    Controller controller = new Controller();
    Light kitchenLight = new Light("厨房");
    Light livingRoomLight = new Light("卧室");
    LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
    LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
    LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
    LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
    controller.setCommand(0, livingRoomLightOn, livingRoomLightOff);
    controller.setCommand(1, kitchenLightOn, kitchenLightOff);
    controller.enableOnButton(0);
    controller.enableOffButton(0);
    controller.enableOnButton(1);
    controller.enableOffButton(1);
  }

}
