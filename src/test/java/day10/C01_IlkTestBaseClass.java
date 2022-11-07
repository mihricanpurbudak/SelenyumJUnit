package day10;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import utilities.TestBaseBeforeAfter;

public class C01_IlkTestBaseClass extends TestBaseBeforeAfter {
    @Test
    public void test1(){

        driver.get("https://amazon.com");
    }
}
//utilities package'ında abstract class oluşturduk. Buradaki class'ı Utilites package'ındaki
// class'a extent yaptik.@Before ve @after methodlarını oradaki class'ta olusturdugumuz icin bu ssyfada olusturmamıza
//gerek kalmadı