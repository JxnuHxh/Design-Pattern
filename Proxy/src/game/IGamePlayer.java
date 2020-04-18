package game;

/**
 * @author atom.hu
 * @version V1.0
 * @Package game
 * @date 2020/3/31 17:51
 */
public interface IGamePlayer {
    public void login(String user, String password);//登陆
    public void killBoss();//杀怪
    public void upgrade(); //升级
}
