package aries.dao.annotation;

import java.lang.annotation.*;

/**
 * Created by Ouyang on 2014/9/18.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DBSource {
    String value();
}
