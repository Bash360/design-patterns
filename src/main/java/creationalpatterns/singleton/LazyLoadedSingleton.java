package creationalpatterns.singleton;

public class LazyLoadedSingleton {
  private static volatile LazyLoadedSingleton instance = null;

  private LazyLoadedSingleton() {}

  public static LazyLoadedSingleton getInstance() {
    if (instance == null) {
      instance = new LazyLoadedSingleton();
    }
    return instance;
  }
}
