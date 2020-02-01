import creationalpatterns.singleton.DbSingleton;

public class Main {
  public static void main(String[] args) {
    DbSingleton db = DbSingleton.getInstance();
    DbSingleton second = DbSingleton.getInstance();
    System.out.println(db);
    System.out.println(second);
  }
}
