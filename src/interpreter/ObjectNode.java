package interpreter;


public class ObjectNode implements Node {
  private String object;  //操作对象
  private String objName;  //操作对象名称
  private String target;
  @Override
  public void interpret(Context context) {
    object = context.currentToken();
    context.skipToken(object);
    //option的类型可以有各种，表，视图，函数，序列，触发器等等。
    if("VIEW".equals(object)){
      objName = "视图";
    }else if("TABLE".equals(object)){
      objName = "表";
    }else if("FUNCTION".equals(object)){
      objName = "函数";
    }else{
      objName = "无法识别命令";
    }
    target = context.currentToken();
    if("FROM".equals(target)){
      target = "";
    }else{
      context.skipToken(target);
    }
  }

  @Override
  public String execute() {
    return objName + target;
  }


}
