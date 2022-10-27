package state;

/**
 * TCP连接建立状态，可以传输数据，关闭连接等
 */
class EstablishedState extends State {
  /**
   * 无状态类，所以实例可以共享
   */
  public static State instance = new EstablishedState();

  @Override
  public void transmit(Connection connection, String data) {
    connection.processOCtet(data);
  }

  /**
   * 关闭连接并切换状态
   */
  @Override
  public void close(Connection connection) {
    System.out.println("Send FIN,receive ACK of FIN");
    changeState(connection, ClosedState.instance);
  }

  public String toString(){
    return "Established";
  }
}

