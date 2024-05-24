package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class ShippingCenterTestSuite {

    @Test
    public void shouldSendPackageIfWeightLighterThan30() {
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String send = bean.sendPackage("example address", 29.00);
        Assertions.assertEquals("Package delivered to: example address", send);
    }
    @Test
    public void shouldntSendPackageIfWeightHeavierThan30(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String send = bean.sendPackage("example address", 31.00);
        Assertions.assertEquals("Package not delivered to: example address", send);
    }

    @Test
    public void shouldSendPackageIfWeightEqualIs30(){
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String send = bean.sendPackage("example address", 30.00);
        Assertions.assertEquals("Package delivered to: example address", send);
    }

}
