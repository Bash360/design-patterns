package memento;

/**
 * The type Editor. the memento patter used to build classes that keeps track of its previous state
 * like the undo and restore feature
 */
public class Editor {
  private String content;

  /**
   * Create state editor state.
   *
   * @return the editor state
   */
  public EditorState createState() {
    return new EditorState(content);
  }

  /**
   * Restore.
   *
   * @param editorState the editor state
   */
  public void restore(EditorState editorState) {
    this.content = editorState.getContents();
  }

  /**
   * Gets content.
   *
   * @return the content
   */
  public String getContent() {
    return content;
  }

  /**
   * Sets content.
   *
   * @param content the content
   */
  public void setContent(String content) {
    this.content = content;
  }
}
