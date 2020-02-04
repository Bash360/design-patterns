import creationalpatterns.factorymethod.Animal.Animal;
import creationalpatterns.factorymethod.Animal.AnimalFactory;
import creationalpatterns.factorymethod.Animal.AnimalType;
import creationalpatterns.factorymethod.website.SiteType;
import creationalpatterns.factorymethod.website.WebSite;
import creationalpatterns.factorymethod.website.WebsiteFactory;

public class Main {
  public static void main(String[] args) {

    WebSite blog = WebsiteFactory.getWebSite(SiteType.SHOP);
    Animal dog = AnimalFactory.getAnimal(AnimalType.DOG);

    System.out.println(blog.getPages().size());
    blog.getPages().forEach(System.out::println);
  }
}
