package interpreter;

public class OperateNode implements Node {

  private String op; //动作
  private String opName;  //动作名称

  @Override
  public void interpret(Context context) {
    op = context.currentToken();
    context.skipToken(op);
    if ("COPY".equals(op)) {
      opName = "复制";
    } else if ("MOVE".equals(op)) {
      opName = "移动";
    } else {
      opName = "无法识别命令";
    }
  }

  @Override
  public String execute() {
    return opName;
  }

}
