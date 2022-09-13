package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		I18nController I18ncontroller  = (I18nController) ctx.getBean("i18nController");
		System.out.println(I18ncontroller.sayHello());

		System.out.println("-------Property");
		PropertyInfectedController controller1 = (PropertyInfectedController) ctx.getBean("propertyInfectedController");
		System.out.println(controller1.getGreetings());
		System.out.println("-------Setter");
		SetterInjectedController controller2 = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(controller2.getGreetings());
		System.out.println("-------Constructor");
		ConstructorInjectedController controller3 = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(controller3.getGreetings());
	}

}
