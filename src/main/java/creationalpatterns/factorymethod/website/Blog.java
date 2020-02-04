package creationalpatterns.factorymethod.website;

// blog creator
public class Blog extends WebSite {
  @Override
  void createWebSite() {
    pages.add(new PostPage());
    pages.add(new CommentPage());
    pages.add(new ContactPage());
    pages.add(new AboutPage());
  }
}
