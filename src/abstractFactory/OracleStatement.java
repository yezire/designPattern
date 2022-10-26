package abstractFactory;

public class OracleStatement implements Statement {


  @Override
  public void delete() {
    System.out.println("delete an Oracle statement");
  }

  @Override
  public void insert() {
    System.out.println("insert an Oracle statement");
  }

  @Override
  public void update() {
    System.out.println("update an Oracle statement");
  }
}
