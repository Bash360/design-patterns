package creationalpatterns.factorymethod.website;

import java.util.ArrayList;
import java.util.List;

// abstract/interface creator
public abstract class WebSite {
  protected List<Page> pages = new ArrayList<Page>();

  public WebSite() {
    this.createWebSite();
  }

  public List<Page> getPages() {
    return pages;
  }

  abstract void createWebSite();
}
