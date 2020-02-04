package creationalpatterns.factorymethod.Animal;

public class Dog implements Animal {
  @Override
  public void run() {
    System.out.println("i am a dog and i am running");
  }

  @Override
  public void eat() {

    System.out.println("i am a dog and i like to eat");
  }
}
