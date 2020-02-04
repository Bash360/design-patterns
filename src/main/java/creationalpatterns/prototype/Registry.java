package creationalpatterns.prototype;

import java.util.HashMap;

public class Registry {
  private HashMap<String, Item> items = new HashMap<>();

  public Item createItem(String type) {
    Item item = null;
    try {
      item = (Item) (items.get(type).clone());
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return item;
  }

  private void loadItems() {
    Movie movie = new Movie();
    movie.setTitle("basic movie");
    movie.setPrice(3.19);
    movie.setRuntime("2 hours");
    items.put("Movie", movie);
  }
}
