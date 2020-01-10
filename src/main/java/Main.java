import memento.Editor;
import memento.History;

public class Main {
  public static void main(String[] args) {
    Editor editor = new Editor();
    History history = new History();

    editor.setContent("my name is mark");
    history.push(editor.createState());

    editor.setContent("close friends calls me bash ");
    history.push(editor.createState());
    editor.setContent("mark bashir");
    editor.restore(history.pop());
    System.out.println(editor.getContent().toString());
  }
}
