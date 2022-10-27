package state;

abstract class State {
  /**
   * 传输请求的流数据(包含各种校验码)
   */
  public void transmit(Connection connection,String data){}
  /**
   * 主动发起打开连接请求
   */
  public void activeOpen(Connection connection){}
  /**
   * 被动接受打开连接请求
   */
  public void passiveOpen(Connection connection){}
  /**
   * 关闭连接
   */
  public void close(Connection connection){}
  /**
   * 发送确认码(ACK码)
   */
  public void acknowledge(Connection connection){}
  /**
   * 发送连接请求
   */
  public void send(Connection connection){}
  /**
   * 根据当前状态，改变TCPConnection的TCP连接状态
   */
  public void changeState(Connection connection, State state){
    connection.changeState(state);
  }
}


