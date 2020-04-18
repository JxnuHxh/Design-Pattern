package game;

/**
 * @author atom.hu
 * @version V1.0
 * @Package game
 * @date 2020/3/31 17:52
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";
              public GamePlayer(String name) {
                 this.name = name;
             }
              @Override
     public void login(String user, String password) {
                  System.out.println("登录名为<" + user + ">的用户<" + this.name + ">登陆成功！");
            }
             @Override
    public void killBoss() {
                 System.out.println("<" + this.name + ">在打怪！");
             }
             @Override
     public void upgrade() {
                 System.out.println("<" + this.name + ">升了一级！");
             }
}
