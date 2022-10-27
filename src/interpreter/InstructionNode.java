package interpreter;


public class InstructionNode implements Node {

  private Node operate, optional, fromDb, targetDb; //动作，操作对象，原始库，目标库

  @Override
  public void interpret(Context context) {
    operate = new OperateNode();
    operate.interpret(context);
    optional = new ObjectNode();
    optional.interpret(context);
    fromDb = new DatabaseNode();
    fromDb.interpret(context);
    targetDb = new DatabaseNode();
    targetDb.interpret(context);
  }

  @Override
  public String execute() {
    return "将数据库" + fromDb.execute() + "中的" + optional.execute() + operate.execute() + "至数据库"
        + targetDb.execute();
  }

}
