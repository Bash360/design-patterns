import creationalpatterns.singleton.LazyLoadedSingleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException,
          InstantiationException, InvocationTargetException {
    LazyLoadedSingleton db = LazyLoadedSingleton.getInstance();
    LazyLoadedSingleton second = LazyLoadedSingleton.getInstance();
    Class random = Class.forName("creationalpatterns.singleton.LazyLoadedSingleton");
    Constructor bash = random.getDeclaredConstructor();
    bash.setAccessible(true);
    LazyLoadedSingleton loaded = (LazyLoadedSingleton) bash.newInstance(null);
    System.out.println(loaded);
    Method m = random.getDeclaredMethod("getInstance", null);
    System.out.println(m.invoke(bash, null));
    System.out.println(db);
    System.out.println(second);
  }
}
