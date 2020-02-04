package creationalpatterns.factorymethod.Animal;

public class createCat implements Creator {
  @Override
  public Animal create() {
    return new Cat();
  }
}
