package builder;

public class Main {

  public static void main(String[] args) {
    FormulaCar formula = new FormulaCar();
    Director director = new Director(formula);//传入具体Builder
    director.construct();//director中使用这些API
    System.out.println("===================");
    director = new Director(new RacingCar());
    director.construct();
    System.out.println("===================");
    director = new Director(new SportsCar());
    director.construct();
    System.out.println("===================");
    director = new Director(new Truck());
    director.construct();
    System.out.println("===================");
  }

}
