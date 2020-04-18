package dynamically;

/**
 * @author atom.hu
 * @version V1.0
 * @Package dynamically
 * @date 2020/4/6 21:54
 */
public class Business implements IBusiness {

    @Override
     public void doWork() {
                 System.out.println("进行业务逻辑处理");
    }
}