package dynamically;

import java.lang.reflect.Proxy;

/**
 * @author atom.hu
 * @version V1.0
 * @Package dynamically
 * @date 2020/4/6 21:56
 */
public class Client {
              public static void main(String[] args) {
               Business business = new Business();
               //生成代理类对象
                  IBusiness proxy = (IBusiness) Proxy.newProxyInstance(
                                 business.getClass().getClassLoader(),
                                 business.getClass().getInterfaces(),
                                new BusinessHandler(business));

                 proxy.doWork();
            }
         }
