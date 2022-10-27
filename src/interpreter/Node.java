package interpreter;

public interface Node {

  void interpret(Context context);

  String execute();
}
