package com.zb;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoannotationservice = context.getBean(DemoAnnotationService.class);
        demoannotationservice.add();

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoMethodService.add();

        context.close();
    }
}
