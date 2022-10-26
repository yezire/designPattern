package mediator;

public class Person {

  private final String name;
  private final String gender;
  public final String age;

  public Person(String name, String gender, String age) {
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", gender='" + gender + '\'' +
        ", age='" + age + '\'' +
        '}';
  }
}
