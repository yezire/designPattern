package abstractFactory;

public class MysqlConnection implements Connection{

  @Override
  public void create() {
    System.out.println("create a MySQL connection");
  }

  @Override
  public void disconnect() {
    System.out.println("disconnect the MySQL connection");

  }
}
