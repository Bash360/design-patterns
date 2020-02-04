import creationalpatterns.factorymethod.Animal.Animal;
import creationalpatterns.factorymethod.Animal.CreateDog;
import creationalpatterns.factorymethod.Animal.Creator;
import creationalpatterns.factorymethod.Animal.createCat;

public class Main {
  public static void main(String[] args) {
    playWithAnimal(new createCat());
    playWithAnimal(new CreateDog());
  }

  public static void playWithAnimal(Creator creator) {
    Animal animal = creator.create();
    animal.eat();
    animal.run();
  }
}
