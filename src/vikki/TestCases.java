package vikki;

import java.util.ArrayList;
import java.util.List;

public class TestCases extends Thread{


    public  void run (){
        testStreamForEach();
    }


    public void testStreamForEach(){

        Student s1 = new Student("vivek",11);

        Student s2 = new Student("vivek",11);

        Student s3 = new Student("vivek",10);

        Student s4 = new Student("vivek",10);

        Student s5 = new Student("vivek",10);

        List<Student> li = new ArrayList<Student>();

        li.add(s1);

        li.add(s2);

        li.add(s3);

        li.add(s4);
        li.add(s5);



        li.stream().forEach(obj -> System.out.println(obj.name));

        li.stream().forEach(System.out::println);

        System.out.println("Age Limit");
        li.stream().filter(obj-> obj.age>10).forEach(System.out::println);


    }
}
