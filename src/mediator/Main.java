package mediator;

public class Main {

  public static void main(String[] args) {
    Mediator mediator = new InfomationSystem();
    mediator.createColleagues();
    Colleague c = mediator.getColleagues().get(0);
    c.findNewTourist(new Person("栀子熊", "girl", "20"));
  }

}
