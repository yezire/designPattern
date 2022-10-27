package state;

/**
 * TCP连接关闭状态，可以打开连接等
 */
class ClosedState extends State {
  /**
   * 无状态实例，可以共享
   */
  public static State instance = new ClosedState();

  /**
   * 主动建立连接,并改变状态
   */
  @Override
  public void activeOpen(Connection connection) {
    System.out.println("Send SYN,receive SYN,ACK,etc.");
    changeState(connection, EstablishedState.instance);
  }

  /**
   * 被动建立连接，并改变状态
   */
  @Override
  public void passiveOpen(Connection connection) {
    changeState(connection, ListeningState.instance);
  }

  public String toString(){
    return "Closed";
  }
}

