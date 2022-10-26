package observer;



public class Main {
  public static void main(String[] args) {
    Subject subject = new TextEdit();
    MyObserver numberObserver = new NumberDisplay();
    MyObserver wordObserver = new WordDisplay();
    MyObserver frequencyObserver = new FrequencyDisplay();
    subject.addObserver(numberObserver);
    subject.addObserver(wordObserver);
    subject.addObserver(frequencyObserver);
subject.execute("crab bear dog cat cat ");
subject.execute("bear crab crab crab ");
subject.execute("dog dog dog ");

  }
}
