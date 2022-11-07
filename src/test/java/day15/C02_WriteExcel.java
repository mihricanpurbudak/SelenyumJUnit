package day15;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
    public class C02_WriteExcel {
        @Test
        public void test1() throws IOException {
            //Yeni bir Class olusturalim WriteExcel
            //Yeni bir test method olusturalim writeExcelTest()
            //Adimlari takip ederek 1.satira kadar gidelim
            String dosyaYolu = "src/resources/ulkeler.xlsx";
            FileInputStream fis = new FileInputStream(dosyaYolu);
            Workbook workbook = WorkbookFactory.create(fis);
            //5.hucreye yeni bir cell olusturalim
            //Olusturdugumuz hucreye “Nufus” yazdiralim
            workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
            //2.satir nufus kolonuna 1500000 yazdiralim
            workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue("1.500.000");
            //10.satir nufus kolonuna 250000 yazdiralim
            workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue("250.000");
            //15.satir nufus kolonuna 54000 yazdiralim
            workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue("54.000");
            //Dosyayi kaydedelim
            FileOutputStream fos = new FileOutputStream(dosyaYolu);
            // Excel dosyamıza veri girişi yaptıktan sonra dosyayı akışa aldığımız gibi sonlandırmamız gerekir.
            // Sonrasında da workbook objemize kayıt etmemiz gerekir
            workbook.write(fos); // Write methodu ile sonlandırdığımız işlemi workbook'a yazdırdık
            //Dosyayi kapatalim
            fis.close();
            fos.close();
            workbook.close();
        }
    }




    /*
 1.satirdaki 2.hucreye gidelim ve yazdiralim
1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim
2.satir 4.cell’in afganistan’in baskenti oldugunu test edelim
    Satir sayisini bulalim
    Fiziki olarak kullanilan satir sayisini bulun
    Ingilizce Ulke isimleri ve baskentleri bir map olarak kaydedelim*/


    //-Dosya yolunu bir String degiskene atayalim
    //-FileInputStream objesi olusturup,parametre olarak dosya yolunu girelim
    //-Workbook objesi olusturalim,parameter olarak fileInputStream objesini girelim
    //-WorkbookFactory.create(fileInputStream)
    //-Sheet objesi olusturun workbook.getSheetAt(Sayfa1)
    //-Row objesi olusturun sheet.getRow(3)
    //-Cell objesi olusturun row.getCell(3)
    //-3. Satır 3. Cell'deki veriyi silelim
    //-Silindiğini test edin

// 1)Yeni bir Class olusturalim WriteExcel
// 2) Yeni bir test method olusturalim writeExcelTest()
// 3) Adimlari takip ederek 1.satira kadar gidelim
// 4) 5.hucreye yeni bir cell olusturalim
// 5) Olusturdugumuz hucreye "Nufus" yazdiralim
// 6) 2.satir nufus kolonuna 1500000 yazdiralim
// 7) 10.satir nufus kolonuna 250000 yazdiralim
// 8) 15.satir nufus kolonuna 54000 yazdiralim
// 9)Dosyayi kaydedelim
// 10)Dosyayi kapatalim

