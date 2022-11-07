package MehmetHocaSelenyum;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    /*
    1-https://www.amazon.com url ine gidiniz
    2-Basligin Amazon kelimesi icerdigini test ediniz
    3-Url in "https://www.amazon.com" a esit oldugunu test edin
    4-sayfayi kapatin
     */
    public static void main(String[] args) {
        // System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe") ;
       // WebDriver driver=new ChromeDriver();
      //  1-https://www.amazon.com url ine gidiniz
      //  driver.get("https://www.amazon.com");
      /* // 2-Basligin Amazon kelimesi icerdigini test ediniz
        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";
        if (actualTitle.contains("Amazon")){
            System.out.println("Title testi PASSED");
        }else{
            System.out.println("Title testi FAILED");
        }

       // 3-Url in "https://www.amazon.com" a esit oldugunu test edin
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl = "https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)){
            System.out.println("Url testi PASSED");
        }else{
            System.out.println("Url testi FAILED");
        }
        //4-sayfayi kapatin
       // driver.close();*/
    }
}

