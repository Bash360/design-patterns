package memento;

public class Editor {
  private String content;

  public EditorState createState() {
    return new EditorState(content);
  }

  public void restore(EditorState editorState) {
    this.content = editorState.getContents();
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
