package business;

/**
 * @author atom.hu
 * @version V1.0
 * @Package business
 * @date 2020/4/6 20:56
 * 这个是静态代理
 */
class UserDaoProxy implements IUserDao {

              private IUserDao iUserDao;

            public UserDaoProxy(IUserDao iUserDao) {
                 this.iUserDao = iUserDao;
             }

              @Override
     public void save() {
               System.out.println("开始事务...");
                iUserDao.save();    //执行目标对象
                System.out.println("提交事务...");
            }
         }
