package mediator;

public class HotelsSubsystem implements Colleague{
  private Mediator mediator;
  @Override
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void informedColleague(Person person) {
    System.out.println(getClass().getName()+"have received "+person+" information");
  }

  public void findNewTourist(Person person){
    System.out.println("在宾馆发现一名新客户");
    mediator.colleagueChanged(person);
  }
}
