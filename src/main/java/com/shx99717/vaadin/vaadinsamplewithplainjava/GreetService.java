package com.shx99717.vaadin.vaadinsamplewithplainjava;

public class GreetService {

    public String greet(String name) {
        if (name == null || name.isEmpty()) {
            return "Hello anonymous user";
        } else {
            return "Hello 3 " + name;
        }
    }
}
