package aries.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ouyang on 2014/10/28.
 */
public class ControllerAspect{
    private static Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        LOGGER.info("{}方法耗时{}ms", new String[]{joinPoint.getSignature().getName(),
                String.valueOf(end - start)});
        return result;
    }

    public void before(JoinPoint joinpoint){
        LOGGER.info("{} start",joinpoint.getSignature().getName());
    }
}
