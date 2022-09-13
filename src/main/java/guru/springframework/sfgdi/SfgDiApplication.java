package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controllers.*;
import guru.springframework.sfgdi.services.PrototypeBean;
import guru.springframework.sfgdi.services.SingeltonBean;
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

		System.out.println("--------------bean scopes-------------------");
		SingeltonBean singeltonBean1 = ctx.getBean(SingeltonBean.class);
		System.out.println("THis is afyer the first bean "+singeltonBean1.getMyScope());
		SingeltonBean singeltonBean2 = ctx.getBean(SingeltonBean.class);
		System.out.println("THis is afyer the Secind bean "+singeltonBean2.getMyScope());

		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean1.getBeanType());
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		System.out.println(prototypeBean2.getBeanType());



	}

}
