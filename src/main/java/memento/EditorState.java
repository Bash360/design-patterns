package memento;

public class EditorState {
  private final String contents;

  public EditorState(String contents) {
    this.contents = contents;
  }

  public String getContents() {
    return contents;
  }
}
