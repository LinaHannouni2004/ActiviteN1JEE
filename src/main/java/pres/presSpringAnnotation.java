package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        //spring implement plusieurs interface
        ApplicationContext context = new AnnotationConfigApplicationContext("ext","metier","dao");
        Imetier metier =  context.getBean(Imetier.class);
        System.out.println(metier.calcul());
    }
}
