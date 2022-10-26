package abstractFactory;

public interface Factory {

  //提供语句对象
  Statement getStatement();

  //提供连接对象
  Connection getConnection();
}
