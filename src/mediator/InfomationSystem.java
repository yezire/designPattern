package mediator;

import java.util.ArrayList;
import java.util.List;

public class InfomationSystem implements Mediator {

 private List<Colleague> colleagues = new ArrayList<>();

  @Override
  public void createColleagues() {
    //生成
    AirportSubsystem airport = new AirportSubsystem();
    HotelsSubsystem hotel = new HotelsSubsystem();
    RestaurantsSubsystem restaurant = new RestaurantsSubsystem();
    TourismAttractionsSubsystem attractions = new TourismAttractionsSubsystem();
    TravelCompaniesSubsystem company = new TravelCompaniesSubsystem();
    //注册
    colleagues.add(airport);
    colleagues.add(hotel);
    colleagues.add(restaurant);
    colleagues.add(attractions);
    colleagues.add(company);
    //设置mediator
    airport.setMediator(this);
    hotel.setMediator(this);
    restaurant.setMediator(this);
    attractions.setMediator(this);
    company.setMediator(this);
  }

  public List<Colleague> getColleagues() {
    return colleagues;
  }
  @Override
  public void colleagueChanged(Person person, Colleague colleague) {
    for (Colleague c : colleagues) {
      if (c.equals(colleague)) {
        continue;
      }
      c.informedColleague(person);
    }
  }


}
