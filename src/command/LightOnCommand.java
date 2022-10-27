package command;


class LightOnCommand implements Command {

  // 开灯命令
  Light light;

  public LightOnCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.on();
  }
}
