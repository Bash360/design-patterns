package state;
/*
 * state pattern used for when the implementation changes upon state changes
 * */
/** @author bash */
public class Canvas {
  private Tool currentTool;

  public void mouseUp() {
    currentTool.mouseUp();
  }

  public void mouseDown() {
    currentTool.mouseDown();
  }

  public Tool getCurrentTool() {
    return currentTool;
  }

  public void setCurrentTool(Tool currentTool) {
    this.currentTool = currentTool;
  }
}
