package mediator;

public interface Mediator {

  public abstract void createColleagues();

  //mediator接口里面写colleague->mediator报告
  //此处是当子系统检测到新游客会向综合系统报告
  public abstract void colleagueChanged(Person person);


}
