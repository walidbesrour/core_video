package com.mycompany.invoce;


import com.mycompany.invoce.controller.InvoiceControllerInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.invoce.controller.web","com.mycompany.invoce.service.prefix","com.mycompany.invoce.repository.database"})
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class App 
{
    public static void main( String[] args )
    {

//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
       InvoiceControllerInterface invoiceController = context.getBean(InvoiceControllerInterface.class);
        invoiceController.createInvoic();




    }
}
