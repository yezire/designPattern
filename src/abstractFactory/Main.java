package abstractFactory;

public class Main {

  public static void main(String[] args) {
    System.out.println("==========Mysql===========");
    Factory mysqlFactory = new MysqlFactory();
    Connection mysqlConnection = mysqlFactory.getConnection();
    Statement mysqlStatement = mysqlFactory.getStatement();
    mysqlConnection.create();
    mysqlConnection.disconnect();
    mysqlStatement.delete();
    mysqlStatement.insert();
    mysqlStatement.update();
    System.out.println("===========Oracle==============");
    Factory oracleFactory = new OracleFactory();
    Connection oracleConnection = oracleFactory.getConnection();
    Statement oracleStatement = oracleFactory.getStatement();
    oracleConnection.create();
    oracleConnection.disconnect();
    oracleStatement.delete();
    oracleStatement.insert();
    oracleStatement.update();

  }
}
