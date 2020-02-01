package creationalpatterns.singleton;

public class DbSingleton {
  private DbSingleton() {}

  private static DbSingleton instance = new DbSingleton();

  public static DbSingleton getDb() {
    return DbSingleton.instance;
  }
}
