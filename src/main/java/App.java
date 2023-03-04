import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = applicationContext.getBean(HelloWorld.class);

        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = applicationContext.getBean(Cat.class);
        System.out.println(cat1 == cat2);
        System.out.println(bean1 == bean2);

    }
}