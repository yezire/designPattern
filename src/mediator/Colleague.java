package mediator;

public interface Colleague {

  public abstract void setMediator(Mediator mediator);

  //colleague接口里面写mediator->colleague的指示
  public abstract void informedColleague(Person person);
  public abstract  void findNewTourist(Person person);
}
