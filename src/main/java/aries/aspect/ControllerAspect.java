package aries.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Ouyang on 2014/10/28.
 */
public class ControllerAspect {
    private static Logger LOGGER = LoggerFactory.getLogger(ControllerAspect.class);

    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        joinPoint.proceed();
        long end = System.currentTimeMillis();
        LOGGER.debug("{}.{}方法耗时{}ms",new String[]{joinPoint.getTarget().getClass().toString(),
                joinPoint.getSignature().getName(),String.valueOf(end-start)});
    }

    public void before(JoinPoint point){
    }

    public void after(JoinPoint point){
    }
}
