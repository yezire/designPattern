package state;

public class Connection {
  private State state;

  /**
   * 默认建立的TCP连接是关闭状态
   */
  public Connection(){
    state = ClosedState.instance;
  }

  /**
   * 主动发起打开连接请求
   */
  public void activeOpen(){
    state.activeOpen(this);
  }
  /**
   * 被动接受打开连接请求
   */
  public void passiveOpen(){
    state.passiveOpen(this);
  }
  /**
   * 关闭连接
   */
  public void close(){
    state.close(this);
  }
  /**
   * 发送确认码(ACK码)
   */
  public void acknowledge(){
    state.acknowledge(this);
  }
  /**
   * 发送连接请求
   */
  public void send(){
    state.send(this);
  }

  /**
   * 改变TCP连接状态
   */
  public void changeState(State state){
    System.out.println(this.state+" ===> "+state);
    this.state = state;
  }

  /**
   *  处理流数据
   */
  public void processOCtet(String stream){
    System.out.println("传输流数据:"+stream);
  }

}
