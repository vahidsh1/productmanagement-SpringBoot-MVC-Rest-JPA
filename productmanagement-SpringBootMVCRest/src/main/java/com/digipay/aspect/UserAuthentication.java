package com.digipay.aspect;

import com.digipay.controller.AccessController;
import jakarta.servlet.http.HttpServletRequest;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UserAuthentication {
    @Autowired
    private AccessController accessController;
    String userNationalID;
    Boolean accessFlag;
    String operationType;
    @Autowired
    HttpServletRequest httpServletRequest;
    @Before(value = "execution(* com.digipay.controller.BaseControllerImpl.*(..)) && args(..,headers)" +
            " || execution ( * com.digipay.controller.DigitalControllerImpl.*(..) ) && args(..,headers)" +
            " || execution ( * com.digipay.controller.ElectricalControllerImpl.*(..) ) && args(..,headers)")

    public void beforeAdvice(JoinPoint joinPoint,HttpHeaders headers) {
        userNationalID=httpServletRequest.getHeader("userNationalID");
        operationType = joinPoint.getSignature().getName();
        accessFlag = accessController.checkAccess(userNationalID, operationType);
        System.out.println(userNationalID);
        if (accessFlag==false) {
            System.out.println("User Not Authorized");
            throw new RuntimeException("User Not Authorized");
        }
        System.out.println("User is Authorized");
    }
}




