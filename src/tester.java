
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;

public class tester {
    public static void main(String[] args) throws IOException {
        File file = new File("testing.pdf");
        PDDocument document = PDDocument.load(file);
        PDFTextStripper pdfTextStripper = new PDFTextStripper();
        pdfTextStripper.setStartPage(1);
        pdfTextStripper.setEndPage(5);
        String text  = pdfTextStripper.getText(document);
        System.out.println(text);
        document.close();
        Formatter x;
        File file1 = new File("text.txt");
        x = new Formatter("text.txt");
        x.format(text, args);
        x.close();
    }
}