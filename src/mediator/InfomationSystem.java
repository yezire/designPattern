package mediator;

public class InfomationSystem implements Mediator{

  @Override
  public void createColleagues() {
    //生成
    AirportSubsystem airport = new AirportSubsystem();
    HotelsSubsystem hotel = new HotelsSubsystem();
    RestaurantsSubsystem restaurant = new RestaurantsSubsystem();
    TourismAttractionsSubsystem attractions = new TourismAttractionsSubsystem();
    TravelCompaniesSubsystem company = new TravelCompaniesSubsystem();
    //设置mediator
    airport.setMediator(this);
    hotel.setMediator(this);
    restaurant.setMediator(this);
    attractions.setMediator(this);
    company.setMediator(this);
  }

  @Override
  public void colleagueChanged(Person person) {

  }
}
