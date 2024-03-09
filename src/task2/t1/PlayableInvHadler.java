package task2.t1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class PlayableInvHadler implements InvocationHandler
{
    private Object obj;
    PlayableInvHadler(Object obj){this.obj = obj;}

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("It works");
        return method.invoke(obj, args);

    }
}
