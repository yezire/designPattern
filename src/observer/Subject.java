package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public abstract class Subject {

  private List<MyObserver> observers = new ArrayList<>();
  protected StringBuilder sb = new StringBuilder();


  public void addObserver(MyObserver obs) {
    observers.add(obs);
  }

  public void removeObserver(MyObserver obs) {
    observers.remove(obs);
  }

  //通知所有的观察者更新状态
  public void notifyObservers() {
    Iterator it = observers.iterator();
    while (it.hasNext()) {
      MyObserver o = (MyObserver) it.next();
      o.update(this);
    }
  }

  public String getText() {
    return sb.toString();
  }
  public abstract  void execute(String string);

}
