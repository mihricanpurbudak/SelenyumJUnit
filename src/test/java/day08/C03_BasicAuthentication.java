
package day08;

        import io.github.bonigarcia.wdm.WebDriverManager;
        import org.junit.After;
        import org.junit.Assert;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

        import java.time.Duration;

public class C03_BasicAuthentication {
    /*
    Bir class olusturun : BasicAuthentication
    https://the-internet.herokuapp.com/basic_auth sayfasina gidin
    asagidaki yontem ve test datalarini kullanarak authentication’i yapin
​
    Html komutu : https://username:password@URL
    Username	: admin
    password	: admin
​
    Basarili sekilde sayfaya girildigini dogrulayin
​
     */
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void test1(){
        //https://the-internet.herokuapp.com/basic_auth sayfasina gidin
        //    asagidaki yontem ve test datalarini kullanarak authentication’i yapin
        //
        //    Html komutu : https://username:password@URL
        //    Username	: admin
        //    password	: admin
        //
        //    Basarili sekilde sayfaya girildigini dogrulayin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        Assert.assertTrue(driver.findElement(By.xpath("//h3")).isDisplayed());

    }
}
/*
Selenium grid=uzaktaki bilgisayarlarda tanımlanmıs farklı browserlar üzerinden test yapmamızı sağlıyor.
Selenium IDE:Browser eklentisi, bunu ekleyince yaptığımız test islemlerini kaydediyor.
 bunu görmeyeceğiz. SeleniumWebDriver SUAN kullandığımız,

 Selenium suanakadar 4 tool cıkardı, Selenium RC, Selenium Webdriver,Selenium IDE, Selenium Grid. Selenium WebDriver-->Selenium2,Selenium3,Selenium4..
 Selenium neden cok tercih ediliyor? En büyük sebebi ucretsiz olması, ikincisi coğu platformlarda calısabilmesi.farklı Dillerdeki browserlari destekleyebilmesi
mobile testi destekler
Agile ve Continuous Delivery ile entegre
Kullanici sayisi fazla
Genix plugin ve extention kütüphaneleri mevcut
Dezavantajları
Bir kod bilgisi gerektirir
Sadece web tabanlı uygulamalarda kullanılır. (mobile test için appium kullaniliyor)
Görüntü karsılastırma yok
Teknik destek yok
Raporlama özelliği yok
Grafik, captchas, barkod ve sekiller ile kullanılamaz.Basaktan

 */