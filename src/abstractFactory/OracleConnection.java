package abstractFactory;

public class OracleConnection implements Connection {

  @Override
  public void create() {
    System.out.println("create an Oracle connection");
  }

  @Override
  public void disconnect() {
    System.out.println("disconnect the Oracle connection");
  }
}
