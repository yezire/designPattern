package interpreter;

public class Main {
  public static void main(String[] args) {
    String str = "MOVE FUNCTION Student FROM srcDB TO desDB";
    Context context = new Context(str);
    Node node = new ExpressionNode();
    node.interpret(context);
    System.out.println(node.execute());
    String str2 = "COPY VIEW FROM srcDB TO desDB";
    Context context2 = new Context(str2);
    Node node2 = new ExpressionNode();
    node2.interpret(context2);
    System.out.println(node2.execute());
  }

}
