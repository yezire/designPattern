package abstractFactory;

public class OracleFactory implements Factory{

  @Override
  public Statement getStatement() {
    return new OracleStatement();
  }

  @Override
  public Connection getConnection() {
    return new OracleConnection();
  }
}
