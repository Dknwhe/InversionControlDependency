package se.ecutb.cai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import se.ecutb.cai.ComponentScanConfig.ConfigurationScan;
import se.ecutb.cai.Input.UserInputService;
import se.ecutb.cai.StudentManagement.StudentManagementInterface;
import se.ecutb.cai.data.StudentDao;
import se.ecutb.cai.models.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationScan.class);

        StudentDao studentDao = context.getBean(StudentDao.class);

        UserInputService userInputService = context.getBean(UserInputService.class);

        StudentManagementInterface studentManagementInterface = context.getBean(StudentManagementInterface.class);

        System.out.println(studentDao);
        System.out.println(userInputService);
        System.out.println(studentManagementInterface);


    }
}
