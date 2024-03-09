package task2.t1;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JustForFun{

}

