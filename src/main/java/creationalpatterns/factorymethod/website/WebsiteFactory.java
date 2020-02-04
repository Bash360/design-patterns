package creationalpatterns.factorymethod.website;

public class WebsiteFactory {

  public static WebSite getWebSite(SiteType siteType) {
    switch (siteType) {
      case BLOG:
        return new Blog();

      case SHOP:
        return new Shop();

      default:
        throw new RuntimeException("web site must have a type");
    }
  }
}
