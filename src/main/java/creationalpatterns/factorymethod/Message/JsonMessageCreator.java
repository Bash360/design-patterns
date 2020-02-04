package creationalpatterns.factorymethod.Message;

public class JsonMessageCreator extends MessageCreator {
  @Override
  Message createMessage() {
    return new JsonMessage();
  }
}
