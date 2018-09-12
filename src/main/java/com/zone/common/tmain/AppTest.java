package com.zone.common.tmain;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * test custom tag.
 */
// new ClassPathXmlApplicationContext("application-context.xml");
@SuppressWarnings("deprecation")
public class AppTest
{
    private static DefaultListableBeanFactory factory;
    
    public static void main(String[] args)
    {
        Resource resource = new ClassPathResource("application-context.xml");
        
        factory = new XmlBeanFactory(resource);
        
        System.out.println(factory.getBean("testBean"));
    }
}
