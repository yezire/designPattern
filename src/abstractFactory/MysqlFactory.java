package abstractFactory;

public  class MysqlFactory implements Factory{


  @Override
  public Statement getStatement() {
    return new MysqlStatement();
  }

  @Override
  public Connection getConnection() {
    return new MysqlConnection();
  }
}
