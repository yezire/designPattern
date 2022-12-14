package builder;

public class Director {

  private Builder builder;

  public Director(Builder builder) {
    this.builder = builder;
  }

  public void construct() {
    builder.makeBody();
    builder.makeTire();
    builder.makeEngine();
    builder.makeGearBox();
  }

}
