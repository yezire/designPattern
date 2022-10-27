package interpreter;


public class DatabaseNode implements Node {
  private String dbName;

  @Override
  public void interpret(Context context) {
    String op = context.currentToken();
    if("FROM".equals(op) || "TO".equals(op)){
      context.skipToken(op);
    }
    dbName = context.currentToken();
    context.skipToken(dbName);
  }

  @Override
  public String execute() {
    return dbName;
  }
}
