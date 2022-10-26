package memento;

import java.util.Stack;

/**
 * 备忘录管理员 负责存储。提供管理员备忘录，无法对备忘录内容进行操作和访问
 *
 * @author yezizhi
 * @date 2022/10/26
 */
public class Caretaker {

  private Stack<Memento> undoStack = new Stack<Memento>();
  private Stack<Memento> redoStack = new Stack<Memento>();

  public Memento undo() {
    redoStack.push(undoStack.pop());
    Memento meme=undoStack.pop();
    redoStack.push(meme);
    return meme;

  }

  public Memento redo() {
    undoStack.push(redoStack.pop());
    Memento meme=redoStack.pop();
    undoStack.push(meme);
    return meme;
  }

  public void storeMeme(Memento memento) {
    undoStack.push(memento);
  }


}

