public class Main {
  public static void main(String[] args) {
    Runtime singletonRuntime = Runtime.getRuntime();
    System.out.println(singletonRuntime);
    Runtime secondRunTIme = Runtime.getRuntime();
    System.out.println(secondRunTIme);
    if (secondRunTIme.equals(singletonRuntime)) {
      System.out.println("the same instance singleton");
    }
  }
}
