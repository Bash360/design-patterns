package creationalpatterns.builder;
/*
 * used to creat objects that have alot of parameters and options for creating
 * objects with either using all parameters or some
 * object creation is handled by the builder which is an inner class, and the object is
 * immutable that is no setters
 * */

public class LunchOrder {
  private String bread = null;
  private String condiments = null;
  private String meat = null;
  private String dressing = null;

  public static class Builder {
    private String bread;
    private String condiments;
    private String meat;
    private String dressing;

    public Builder() {}

    public Builder bread(String bread) {
      this.bread = bread;
      return this;
    }

    public Builder condiments(String condiments) {
      this.condiments = condiments;
      return this;
    }

    public Builder meat(String meat) {
      this.meat = meat;
      return this;
    }

    public Builder dressing(String dressing) {
      this.dressing = dressing;
      return this;
    }

    public LunchOrder build() {
      return new LunchOrder(this);
    }
  }

  private LunchOrder(Builder builder) {
    this.bread = builder.bread;
    this.condiments = builder.condiments;
    this.dressing = builder.dressing;
    this.meat = builder.meat;
  }

  public String getBread() {
    return bread;
  }

  public String getCondiments() {
    return condiments;
  }

  public String getMeat() {
    return meat;
  }

  public String getDressing() {
    return dressing;
  }
}
