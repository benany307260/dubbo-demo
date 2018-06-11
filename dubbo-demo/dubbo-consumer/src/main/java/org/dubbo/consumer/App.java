package org.dubbo.consumer;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.testcomp.test.DemoService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "classpath:springmvc.xml" });

        context.start();
        DemoService demoService = (DemoService) context.getBean("demoService");

        System.out.println(demoService.sayHello("李星星"));
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        context.close();
    }
}
