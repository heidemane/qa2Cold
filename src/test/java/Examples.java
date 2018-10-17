import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Examples {
    @Test
    public void examples(){
        List<String> klase = new ArrayList<String>();//izveidojam jaunu tukšu sarakstu
        klase.add("Laura");
        klase.add("Dmitrijs");
        klase.add("Ieva");
        klase.add("Sergejs");
        System.out.println("Size of List is:" +  klase.size());
        System.out.println("Is list empty:" + klase.isEmpty());
        System.out.println("3rd one is:" + klase.get(2));

    }
}
