package test;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/3/31 17:44
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("真实的请求RealSubject");
    }
}
