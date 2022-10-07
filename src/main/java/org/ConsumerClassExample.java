package org;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class ConsumerClassExample {
    public static void main(String[] args) {
    List<String> name= Arrays.asList("Ahmad","Mohammad","Sakawat","Yaseer");
        // lambda example
        // consumer class
        Consumer<String> con=(c)-> System.out.println(c);
        //name.forEach(con);
        //name.forEach(c-> System.out.println(c));
        Consumer<String> con1=(c)->System.out.println(c.toUpperCase());
        Consumer<String> con2=(c)-> System.out.println(c.toLowerCase());
        name.forEach(con1);
        name.forEach(con.andThen(con1).andThen(con2));

    }
}
