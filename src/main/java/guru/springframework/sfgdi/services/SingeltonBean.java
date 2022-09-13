package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingeltonBean {

    public SingeltonBean() {
        System.out.println("This is the singleton bean constructor -----------------");
    }

    public String getMyScope()
    {
        return "Singleton Scope";
    }
}

