package ioc;

import ioc.entity.Student;
import ioc.select.MySelector;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

/**
 * @author CBeann
 * @create 2020-01-30 18:41
 */
@ComponentScan("ioc")
@Import({MySelector.class})
public class App {

  public static void main(String[] args) throws Exception {
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
    Student bean = (Student) context.getBean("student");
    bean.speak();
    Object o = bean.getapplicationContext();


    //        Student bean = (Student)context.getBean(Student.class);
    //        bean.speak();

    //        Car bean = (Car)context.getBean(Car.class);
    //        bean.speak();
    //        Car bean = (Car)context.getBean("carFactoryBean");
    //        bean.speak();

    //        Teacher teacher = context.getBean(Teacher.class);
    //        teacher.spark();

    System.out.println("--OVER--");
  }
}
