package state;

/**
 * TCP监听状态，可以发送ACK，SYN，FIN等请求数据
 */
class ListeningState extends State {
  public static State instance = new ListeningState();

  /**
   * 发送请求数据
   */
  @Override
  public void send(Connection connection) {
    changeState(connection, EstablishedState.instance);
  }

  public String toString(){
    return "Listen";
  }
}

