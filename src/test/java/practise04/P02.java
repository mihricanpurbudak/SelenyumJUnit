
package practise04;
import org.junit.Assert;
import org.junit.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
public class P02 {
    //Verify that we have pom.xml file in our project => please try in 4 min s
    @Test
    public void verify() {
        String path="pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(path)));
    }
}
/*
Mevlut
  5:17 PM
File file= new File("pom.xml");
assert !file.isHidden();

  //Verify that we have pom.xml file in our project => please try in 4 min s
    String dosyaYolu="pom.xml";
    FileInputStream fis = new FileInputStream(dosyaYolu);

    Assert.assertNotNull(fis);
}
Orhan
  5:17 PM
    String actualData = "pom.xml";
    String expectedData = System.getProperty("pom.xml.filename");

    Assert.assertEquals(actualData, expectedData);
}

Suleyman Cevik
  5:16 PM
@Test
    public void name() {

        String dosyaYol = "pom.xml";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYol)));
    }
}

demir
  5:16 PM
System.out.println("System.getProperty(\"pom.xml\") = " + System.getProperty("pom.xml"));
 */