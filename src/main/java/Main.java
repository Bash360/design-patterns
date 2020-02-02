import creationalpatterns.builder.LunchOrder;

public class Main {
  public static void main(String[] args) {
    LunchOrder.Builder builder = new LunchOrder.Builder();
    LunchOrder myLunch =
        builder
            .bread("sliced bread")
            .condiments("yes butter and sardine")
            .dressing("foil wrapper")
            .meat("steak")
            .build();
    System.out.println(myLunch.getBread());
    System.out.println(myLunch.getCondiments());
    System.out.println(myLunch.getDressing());
    System.out.println(myLunch.getMeat());
  }
}
