package game;

/**
 * @author atom.hu
 * @version V1.0
 * @Package game
 * @date 2020/3/31 17:53
 */
public class GamePlayerProxy implements IGamePlayer{
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
               this.gamePlayer = gamePlayer;
             }

             @Override
     public void login(String user, String password) {
                 this.gamePlayer.login(user, password);
             }

             @Override
     public void killBoss() {
                this.gamePlayer.killBoss();
             }

             @Override
     public void upgrade() {
                 this.gamePlayer.upgrade();
             }
}
