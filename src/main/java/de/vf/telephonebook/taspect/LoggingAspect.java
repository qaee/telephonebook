package de.vf.telephonebook.taspect;

import de.vf.telephonebook.model.Contact;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("execution(public de.vf.telephonebook.model.Contact save*(*))")
    public void log(JoinPoint joinPoint) {
        System.out.println("Save Method called!!!!! "+joinPoint.getSignature().getName());
        Contact arg = (Contact) joinPoint.getArgs()[0];
        System.out.println("saving Contact of name "+ arg.getName());
    }
    @Before("execution(@javax.annotation.security.RolesAllowed * *(..))")
    public void log1(JoinPoint joinPoint) {
        System.out.println("Method called!!!!! "+joinPoint.getArgs());
    }
    @Around("execution(* listAll*(..))")
    public void logAroundAllMethods(ProceedingJoinPoint joinPoint) throws Throwable
    {
        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": Before Method Execution");
        try {
            joinPoint.proceed();
        } finally {
            //Do Something useful, If you have
        }
        System.out.println("****LoggingAspect.logAroundAllMethods() : " + joinPoint.getSignature().getName() + ": After Method Execution");
    }
}
