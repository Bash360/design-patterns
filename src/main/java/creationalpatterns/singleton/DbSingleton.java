package creationalpatterns.singleton;

/* manage object life cycle
private constructors to avoid user creation of classes
and the variable should be static to have one of it for every class
and a method to get instance
no argument should be passed
*/

public class DbSingleton {
  private DbSingleton() {}

  private static DbSingleton instance = new DbSingleton();

  public static DbSingleton getInstance() {
    return DbSingleton.instance;
  }
}
