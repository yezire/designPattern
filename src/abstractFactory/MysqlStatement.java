package abstractFactory;

public class MysqlStatement implements Statement {

  @Override
  public void delete() {
    System.out.println("delete a Mysql statement");
  }

  @Override
  public void insert() {
    System.out.println("insert a Mysql statement");
  }

  @Override
  public void update() {
    System.out.println("update a Mysql statement");
  }
}
