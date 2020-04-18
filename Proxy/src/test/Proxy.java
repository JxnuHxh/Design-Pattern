package test;

/**
 * @author atom.hu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2020/3/31 17:45
 */
public class Proxy implements Subject {
    private RealSubject realSubject = null;
             public Proxy() {
                 this.realSubject = new RealSubject();
             }
    @Override
    public void request() {
        this.before();
                this.realSubject.request();
                 this.after();
             }

             //预处理
             private void before() {
                 System.out.println("-------before------");
             }

             //善后处理
    private void after() {
        System.out.println("-------after-------");
    }
}
