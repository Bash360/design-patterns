package factorymethod;

public class Cat implements Animal {
  @Override
  public void run() {
    System.out.println("cat is running");
  }

  @Override
  public void eat() {
    System.out.println("cat is eating");
  }
}
