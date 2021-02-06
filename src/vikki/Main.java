package vikki;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        TestCases test =  new TestCases();
        test.start();

        MyThread t = new MyThread();
        t.start();
    }
}
