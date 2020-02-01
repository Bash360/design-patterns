import creationalpatterns.singleton.LazyLoadedSingleton;

public class Main {
  public static void main(String[] args) {
    LazyLoadedSingleton db = LazyLoadedSingleton.getInstance();
    LazyLoadedSingleton second = LazyLoadedSingleton.getInstance();
    System.out.println(db);
    System.out.println(second);
  }
}
