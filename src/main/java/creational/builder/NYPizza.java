package creational.builder;

import java.util.Objects;

public class NYPizza extends Pizza{

  public enum Size {SMALL, MEDIUM, LARGE};
  private final Size size;

  public static class Builder extends Pizza.Builder {

    private final Size size;

    public Builder(Size size){
      this.size = Objects.requireNonNull(size);
    }

    public NYPizza build() {
      return new NYPizza(this);
    }

    protected Builder self() {
      return this;
    }
  }
  private NYPizza(Builder builder) {
    super(builder);
    size = builder.size;
  }
}
