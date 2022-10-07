package org;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClassExample {
    public static void main(String[] args) {
    List<String> name= Arrays.asList("Ahmad","Mohammad","Sakawat","Yaseer");
        // lambda example
        // consumer class
        Consumer<String> con=(c)-> System.out.println(c);
        name.forEach(con);
    }
}
