package memento;

/** The type Editor state. */
public class EditorState {
  private final String contents;

  /**
   * Instantiates a new Editor state.
   *
   * @param contents the contents
   */
  public EditorState(String contents) {
    this.contents = contents;
  }

  /**
   * Gets contents.
   *
   * @return the contents
   */
  public String getContents() {
    return contents;
  }
}
