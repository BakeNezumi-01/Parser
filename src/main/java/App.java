import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class App{
    public static void main (String[] args){
        try {
            String text = getText(new File("src/main/resources/testFiles/Чернобровкин_ИС_2_Сопроводительность.pdf"));
            System.out.println("Text in PDF: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static String getText(File pdfFile) throws IOException {
        PDDocument doc = PDDocument.load(pdfFile);
        return new PDFTextStripper().getText(doc);
    }
}
