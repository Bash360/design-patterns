package memento;

import java.util.ArrayList;
import java.util.List;

/** The type History. */
public class History {
  private List<EditorState> states = new ArrayList<EditorState>();

  /**
   * Push.
   *
   * @param editorState the editor state
   */
  public void push(EditorState editorState) {
    states.add(editorState);
  }

  /**
   * Pop editor state.
   *
   * @return the editor state
   */
  public EditorState pop() {
    var lastIndex = states.size() - 1;

    var lastState = states.get(lastIndex);
    states.remove(lastIndex);
    return lastState;
  }
}
