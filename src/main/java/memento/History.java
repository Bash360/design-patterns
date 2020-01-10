package memento;

import java.util.ArrayList;
import java.util.List;

public class History {
  private List<EditorState> states = new ArrayList<EditorState>();

  public void push(EditorState editorState) {
    states.add(editorState);
  }

  public EditorState pop() {
    var lastIndex = states.size() - 1;

    var lastState = states.get(lastIndex);
    states.remove(lastIndex);
    return lastState;
  }
}
