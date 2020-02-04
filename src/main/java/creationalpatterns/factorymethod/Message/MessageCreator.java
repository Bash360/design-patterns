package creationalpatterns.factorymethod.Message;

public abstract class MessageCreator {
  public Message getMessage() {
    Message msg = createMessage();
    msg.addDefaultHeaders();
    msg.encrypt();
    return msg;
  }

  abstract Message createMessage();
}
