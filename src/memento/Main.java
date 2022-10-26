package memento;

public class Main {

  public static void main(String[] args) {
    Originator originator = new Originator();
    Caretaker caretaker = new Caretaker();
    originator.setContent("只是一只小熊而已,为什么要写这么多设计模式作业..TAT,不想做作业了。。。");
    caretaker.storeMeme(originator.createMemento());
    System.out.println(originator.getContent());
    originator.setContent("算了还是做吧。。。");
    caretaker.storeMeme(originator.createMemento());
    System.out.println(originator.getContent());
    //undo
    System.out.println("======undo=====");
    originator.restoreMeme(caretaker.undo());
    System.out.println(originator.getContent());
    //redo
    System.out.println("======redo=====");
    originator.restoreMeme(caretaker.redo());
    System.out.println(originator.getContent());


  }

}
