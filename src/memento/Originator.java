package memento;

/**
 * 发起者:负责创建备忘录，以及撤销(Undo)和重做/恢复(Redo)功能
 *设置当前状态
 *
 * @author yezizhi
 * @date 2022/10/26
 */
public class Originator {
  private String content;


  public Memento createMemento(){
    Memento memento = new Memento(content);
    return memento;
  }
  public String getContent(){
    return content;
  }

  public void restoreMeme(Memento memento){
    this.content = memento.getContent();
  }

  public void setContent(String content){
    this.content = content;
  }


}
