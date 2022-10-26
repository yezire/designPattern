package mediator;

public class RestaurantsSubsystem implements Colleague{
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
    //findNewTourist不写在colleague接口里面的原因是：对于mediator设计模式来说这个方法不是普适的模版，
    // 只是由于我实现的时候不想根据餐厅、机场这些不同场景设置不同的处理方法，因此用了同一个形式，但是在实际问题中
    //一般都会不一样，因此没有写成固定接口。
    System.out.println("在餐厅发现一名新客户");
    mediator.colleagueChanged(person);
  }
}
