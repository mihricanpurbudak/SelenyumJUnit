package day07;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;
public class C02_DropDownHandle {
    /*
           ●https://www.amazon.com/ adresinegidin.
           -Test1
           Arama kutusunun yanindaki kategori menusundeki kategori sayisinin45
           oldugunu testedin
           -Test2
           1.Kategori menusunden Books seceneginisecin
           2.Arama kutusuna Java yazin vearatin
           3.Bulunan sonuc sayisiniyazdirin
           4.Sonucun Java kelimesini icerdigini testedin
*/
    WebDriver driver;
    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
    }
    @After
    public void tearDown() {
        //driver.close();
    }
    @Test
    public void test1(){
        //Arama kutusunun yanindaki kategori menusundeki kategori sayisinin 45
        //oldugunu test edin
        List<WebElement> drops = driver.findElements(By.xpath("//option"));
        System.out.println(drops.size());
        for (WebElement w:drops) {
            System.out.println(w.getText());
        }
        int dropDownList = drops.size();
        int expectedSayi = 45;
        Assert.assertNotEquals(expectedSayi,dropDownList);
    }
    @Test
    public void test2(){
//           1.Kategori menusunden Books secenegini secin
        WebElement ddm = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
        ddm.sendKeys("Books");
//           2.Arama kutusuna Java yazin vearatin
        driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']")).sendKeys("Java", Keys.ENTER);
//           3.Bulunan sonuc sayisiniyazdirin
        WebElement sonucYazisi = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYazisi.getText());
//           4.Sonucun Java kelimesini icerdigini testedin
        String expectedKelime = "Java";
        String actualSonucYazisi = sonucYazisi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedKelime));

    }
}



/*
driver.get("https://www.amazon.com");
WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
Select select = new Select(ddm);
select.selectByVisibleText("Books");

// bir dropdown ile calisirken son secilen option'a ulasmak isterseniz
// select.getFirstSelectedOption() method'unu kullanmalisiniz
// bu method bize WebElement dondurur
// uzerindeki yaziyi yazdirmak icin getText() unutulmamalidir

System.out.println(select.getFirstSelectedOption().getText()); // sectigimiz elementi yazdirdik


// dropdown'daki opsiyonlarin toplam sayisinin
//     28 oldugunu test edin

List<WebElement> optionList=select.getOptions(); // bu bize list dondurdugu icin liste atadik

int actualOptionSayisi=optionList.size(); // olan
int expectedOptionSayisi=28; // beklenen

Assert.assertEquals(expectedOptionSayisi,actualOptionSayisi);
driver.get("https://www.amazon.com");
WebElement ddm=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
Select select = new Select(ddm);
select.selectByVisibleText("Books");

// bir dropdown ile calisirken son secilen option'a ulasmak isterseniz
// select.getFirstSelectedOption() method'unu kullanmalisiniz
// bu method bize WebElement dondurur
// uzerindeki yaziyi yazdirmak icin getText() unutulmamalidir

System.out.println(select.getFirstSelectedOption().getText()); // sectigimiz elementi yazdirdik


// dropdown'daki opsiyonlarin toplam sayisinin
//     28 oldugunu test edin

List<WebElement> optionList=select.getOptions(); // bu bize list dondurdugu icin liste atadik

int actualOptionSayisi=optionList.size(); // olan
int expectedOptionSayisi=28; // beklenen

Assert.assertEquals(expectedOptionSayisi,actualOptionSayisi);

Mevlut
  8:16 PM
list.stream.map(WebElement::getText).forEach(System.out::println)


 */
