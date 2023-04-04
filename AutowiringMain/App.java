package ustbatchno3.Com.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	
    ApplicationContext context=   
    new ClassPathXmlApplicationContext("ApplicationA.xml"); 
    Notificationservice n=context.getBean("sample",Notificationservice.class);
    n.notifyservice();
}
} 