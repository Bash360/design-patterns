package state;

/** The type Eraser tool. */
public class EraserTool implements Tool {
  @Override
  public void mouseDown() {
    System.out.println("Eraser down");
  }

  @Override
  public void mouseUp() {
    System.out.println("Erase something");
  }
}
