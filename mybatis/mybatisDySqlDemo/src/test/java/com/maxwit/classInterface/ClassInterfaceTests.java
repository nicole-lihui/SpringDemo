package com.maxwit.classInterface;

import org.junit.Test;

public class ClassInterfaceTests {

    class Imp implements GreetingService {
        public void sayMessage(String message) {
            System.out.println(message);
        }
    }

    public void t() {
        GreetingService b = new Imp();
        b.sayMessage("Tom");
    }


    @Test
    public void testClass() {
        ClassInterfaceTests c= new ClassInterfaceTests();
        this.t();

        Imp b = new Imp();
        b.sayMessage("Tom");

        GreetingService lamda = name -> System.out.println(name);
        lamda.sayMessage("Nicole");
    }
}
