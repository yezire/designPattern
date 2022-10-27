package command;

class LightOffCommand implements Command {
  // 关灯命令

  Light light;

  public LightOffCommand(Light light) {
    this.light = light;
  }

  public void execute() {
    light.off();
  }
}
