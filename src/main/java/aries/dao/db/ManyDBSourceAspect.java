package aries.dao.db;

import aries.dao.annotation.DBSource;
import org.apache.commons.lang3.StringUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by Ouyang on 2014/9/18.
 */
public class ManyDBSourceAspect {

    public void before(JoinPoint point) throws Exception {
        //拦截的实体类
        Object target = point.getTarget();
        //拦截的方法名称
        String methodName = point.getSignature().getName();
        //拦截的放参数类型
        Class<?>[] parameterTypes = ((MethodSignature)point.getSignature()).getMethod().getParameterTypes();
        Class<?>[] clazzs = target.getClass().getInterfaces();
        Class<?> clazz = null;
        if (clazzs != null && clazzs.length > 0){
            clazz = clazzs[0];
        }

        if (clazz == null) {
            //这个应该不可能出现
            throw new RuntimeException("not found Class.");
        }

        // 拿接口中的方法级别的注解
        Method m = clazz.getMethod(methodName, parameterTypes);
        if (m != null && m.isAnnotationPresent(DBSource.class)){
            DBSource ca = m.getAnnotation(DBSource.class);
            if (StringUtils.isNotBlank(ca.value())){
                ManyDBSourceSwitch.setDataSourceType(ca.value());
                return;
            }
        }
        // 拿到类的方法级别注解
        m = target.getClass().getMethod(methodName, parameterTypes);
        if (m != null && m.isAnnotationPresent(DBSource.class)){
            DBSource ca = m.getAnnotation(DBSource.class);
            if (StringUtils.isNotBlank(ca.value())){
                ManyDBSourceSwitch.setDataSourceType(ca.value());
                return;
            }
        }

        // 拿到类级别的注解
        DBSource can =  (DBSource) clazz.getAnnotation(DBSource.class);
        if(can != null && StringUtils.isNotBlank(can.value())){
            ManyDBSourceSwitch.setDataSourceType(can.value());
            return;
        }

    }

}
