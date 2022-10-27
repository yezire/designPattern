package state;

public class Main {
  public static void main(String[] args) {
    Connection connection = new Connection();
    connection.activeOpen();
    connection.acknowledge();
    connection.send();
    connection.processOCtet("hello!!!好想出校玩啊，想要纯玩一整天");
    connection.close();

  }

}
