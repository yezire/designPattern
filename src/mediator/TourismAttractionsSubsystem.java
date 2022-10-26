package mediator;

public class TourismAttractionsSubsystem  implements Colleague{
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
    System.out.println("在景点发现一名新客户");
    mediator.colleagueChanged(person,this);
  }
}
