package command;

class Controller {
  // 遥控器

  Command[] onCommands = new Command[5];
  Command[] offCommands = new Command[5];

  public Controller() {
  }

  public void setCommand(int id, Command onCommand, Command offCommand) {
    onCommands[id] = onCommand;
    offCommands[id] = offCommand;
  }

  public void enableOnButton(int id) {
    onCommands[id].execute();
  }

  public void enableOffButton(int id) {
    offCommands[id].execute();
  }
}


