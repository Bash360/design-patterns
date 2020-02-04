package creationalpatterns.factorymethod.Message;

public class TextMessageCreator extends MessageCreator {
  @Override
  Message createMessage() {
    return new TextMessage();
  }
}
