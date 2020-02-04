package creationalpatterns.factorymethod.Message;

public class MessageFactory {
  public static Message getMessage(MessageType messageType) {
    switch (messageType) {
      case TEXT_MESSAGE:
        return new TextMessageCreator().createMessage();
      case JSON_MESSAGE:
        return new JsonMessageCreator().createMessage();
      default:
        throw new RuntimeException("must have a type of message");
    }
  }
}
