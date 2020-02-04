package creationalpatterns.factorymethod.Animal;

public class AnimalFactory {
  public static Animal getAnimal(AnimalType animalType) {
    switch (animalType) {
      case DOG:
        return new CreateDog().create();
      case CAT:
        return new createCat().create();
      default:
        throw new RuntimeException("animal must have a type");
    }
  }
}
