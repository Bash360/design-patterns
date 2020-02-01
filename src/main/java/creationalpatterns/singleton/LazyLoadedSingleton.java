package creationalpatterns.singleton;

public class LazyLoadedSingleton {
  private static volatile LazyLoadedSingleton instance = null;

  private LazyLoadedSingleton() {
    if (instance != null) {

      throw new RuntimeException("use get instance to create object");
    }
  }

  public static LazyLoadedSingleton getInstance() {
    if (instance == null) {
      synchronized (LazyLoadedSingleton.class) {
        instance = new LazyLoadedSingleton();
      }
    }
    return instance;
  }
}
