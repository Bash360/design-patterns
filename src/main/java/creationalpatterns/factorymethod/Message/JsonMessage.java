package creationalpatterns.factorymethod.Message;

public class JsonMessage extends Message {
  @Override
  public String getContent() {
    return "{\" Json \" : []}";
  }
}
