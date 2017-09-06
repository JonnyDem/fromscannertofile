package fromscannertofile;



/**
 * Created by Ваня on 06.09.2017.
 *  Написать программу которая записует в файл введенный текст через сканнер.
 *
 */
public class MainClass {

    public static void main(String[] args) {

        EnterTextFromScanner enterTextFromScanner = new EnterTextFromScannerImpl();
        enterTextFromScanner.writeTextFromScannerToFile();
    }


}
