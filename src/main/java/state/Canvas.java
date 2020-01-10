package state;
/*
 * state pattern used for when the implementation changes upon state changes
 * it supports the open closed design principle which is states our classes should be open for extension but closed
 * for modification.
 * it also helps for a cleaner and more robust code base
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
