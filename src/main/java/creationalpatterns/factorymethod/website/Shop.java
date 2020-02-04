package creationalpatterns.factorymethod.website;

public class Shop extends WebSite {
  @Override
  void createWebSite() {
    pages.add(new CartPage());
    pages.add(new ItemPage());
    pages.add(new SearchPage());
  }
}
