package creationalpatterns.factorymethod.Animal;

public class CreateDog implements Creator {
  @Override
  public Animal create() {
    return new Dog();
  }
}
