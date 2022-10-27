package proxy;

public interface Searchable {
  public abstract Integer getPrice(String name) throws UnregisteredGoods;

}
