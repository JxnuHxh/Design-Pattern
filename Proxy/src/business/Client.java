package business;

/**
 * @author atom.hu
 * @version V1.0
 * @Package business
 * @date 2020/4/6 20:57
 * 事务
 */
public class Client {
    public static void main(String[] args) {
                UserDao userDao = new UserDao();
                UserDaoProxy proxy = new UserDaoProxy(userDao);
                proxy.save();
             }
}
