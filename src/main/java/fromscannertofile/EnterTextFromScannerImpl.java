package fromscannertofile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Ваня on 06.09.2017.
 */
public class EnterTextFromScannerImpl implements EnterTextFromScanner {

    @Override
    public void writeTextFromScannerToFile() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter path where you want to create new or use existing file (example: C:\\Users\\IdeaProjects\\fromscannertofile\\src\\main\\resources\\Scanner.txt)");
        String path = scan.nextLine();
        File file = new File(path);
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            System.out.println("Enter text");
            String text = scan.nextLine();
            FileWriter fw = new FileWriter(file, true);
            fw.write(text + "\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            scan.close();
        }
    }
}
