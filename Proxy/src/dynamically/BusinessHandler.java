package dynamically;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author atom.hu
 * @version V1.0
 * @Package dynamically
 * @date 2020/4/6 21:55
 */
 class BusinessHandler implements InvocationHandler {
              private IBusiness iBusiness;
              public BusinessHandler(IBusiness iBusiness) {
                 this.iBusiness = iBusiness;
             }
              @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                  System.out.println("before");
                 method.invoke(iBusiness, args);
                 System.out.println("after");
                 return null;
              }
 }