import task2.t1.Hospital;
import task2.t1.Unit;

import java.lang.reflect.*;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!\n");
        Unit u1 = new Unit("Ork1", 12f);
        u1.doVoice();

//        //reflection exercises
        Class cls = u1.getClass();
//
//        //list the fields
//        for(Field f : cls.getFields())
//        {
//            System.out.println(f.getName());
//        }
//        System.out.println("===============");
//        for(Field f : cls.getDeclaredFields())
//        {
//            System.out.println(f.getName());
//        }
//
//        //count of spec. constructors
//        long c = Arrays.stream(cls.getDeclaredConstructors()).
//                filter(x->((Constructor)x).accessFlags().contains(AccessFlag.PRIVATE)).
//                filter(x->((Constructor)x).getParameterCount()==0).
//                count();
//        System.out.println(c);
//
//        //========== open closed field
//        System.out.println("============ open closed field");
//        for(Field f : cls.getDeclaredFields())
//        {
//            System.out.println(f.getName());
//        }
//
//        Field field = cls.getDeclaredField("health");
//        field.setAccessible(true);
//        field.set(u1, -400f);
//        u1.doVoice();
//        //==============
//
//        //==============method invoking
//        System.out.println("\nmethod invoking\n");
//        Method method = cls.getMethod("doVoice");
//        System.out.println(method.getAnnotatedReturnType());
//        method.invoke(u1, null);

        //and annotations are accessible too
//        Arrays.stream(cls.getMethods()).
//                forEach(x-> Arrays.stream(x.getDeclaredAnnotations()).
//                        forEach(y->{
//                            System.out.println(y.toString());
//                        }));
//
    Hospital hospitalNum1 = new Hospital();
    u1.setHealth(10f); // :(
    //hospitalNum1.heal(u1); //!!!!!!!!!!!!


    }
}