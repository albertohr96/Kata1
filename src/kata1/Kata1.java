package kata1;

import java.util.Date;

public class Kata1 {
    
    public static void main(String[] args) {
        Person person=new Person("Alberto", new Date(96,5,21));
        System.out.println(person.getName()+" tiene "+ person.getAge()+" años.");
    }
}
