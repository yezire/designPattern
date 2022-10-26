package memento;

/**
 * 纪念品 用于存储Originator的内部状态，可以防止Originator以外的对象访问
 *
 * @author yezizhi
 * @date 2022/10/26
 */
public class Memento {

  private String content;

  public Memento(String content) {
    this.content = content;
  }

  public String getContent() {
    return this.content;
  }



}
