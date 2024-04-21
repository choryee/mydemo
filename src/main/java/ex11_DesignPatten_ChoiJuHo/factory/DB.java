package ex11_DesignPatten_ChoiJuHo.factory;

public interface DB {
    public int execute(String sql);
    public void setUrl(String url);
}
