package ru.tsc.tav.app.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdolApp {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springIdol.xml");
        Performer duke = (Performer)ctx.getBean("duke");
        duke.perform();
        Performer poeticDuke = (Performer)ctx.getBean("poeticDuke");
        poeticDuke.perform();
    }
}
