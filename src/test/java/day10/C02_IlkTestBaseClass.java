
package day10;
        import org.junit.Test;
        import utilities.TestBaseBeforeClassAfterClass;
public class C02_IlkTestBaseClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1(){
        driver.get("https://amazon.com");
    }
}
/*
Selenium’da en sık karşılaşılan hatalar:
ElementNotVisibleException: Selenium Web sayfasında görünür olmayan bir elementi bulmaya çalıştığında karşılaşılan bir exception türüdür.
NoAlertPresentException: Olmayan bir uyarı/pop-up şeklindeki diyalog üzerinde işlem yapılmaya çalışıldığında karşılaşılır.
NoSuchWindowException: Yeni bir pencereye geçmeye çalışıldığında alınan exception türüdür.
NoSuchElementException: Sayfada bulunmayan bir elemente erişim sağlanmaya çalışıldığında karşılaşılır.
WebDriverException: Herhangi bir kod bloğu Selenium Web Driver’ı çalıştıramadığında oluşan exception türüdür.
 */