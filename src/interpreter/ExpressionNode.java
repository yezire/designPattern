package interpreter;

import java.util.ArrayList;
import java.util.List;

public class ExpressionNode implements Node {
  private List<Node> nodes = new ArrayList<>();

  @Override
  public void interpret(Context context) {
    while (true){
      if(context.currentToken() == null){
        break;
      }else{
        Node node = new InstructionNode();
        node.interpret(context);
        nodes.add(node);
      }
    }
  }

  @Override
  public String execute() {
    String result = "";
    for (Node node : nodes) {
      result += node.execute();
    }
    return result;
  }
}

