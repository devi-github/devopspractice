package devopspractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test1 {
    @Test
    public void method() {
        System.out.println("Hello sleepers");
        Reporter.log("Hi Friends");
    }
}

