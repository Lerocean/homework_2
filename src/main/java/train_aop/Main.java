package train_aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan
public class Main {

    public static void main(String[] args) {
        printName("Толя");
        printName("Вова");
        printName("Саша");
    }

    public static void printName(String name) {
        System.out.println(name);
    }
}
