package seminar_2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Task_3_2 {
    public static void main(String[] args) {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");

        String s = "test";
        int n = 10;
        String res = repeat(s, n);
        writeInFile(res, pathFile);
        readFile(res, pathFile);

    }

    static void writeInFile (String res, String pathFile) {
        Logger logger = Logger.getAnonymousLogger();
        FileHandler handler = new FileHandler("log.txt");
        logger.addHandler(handler);

        try(FileWriter f = new FileWriter(pathFile, true)) {
            f.write(res);
            logger.info("Успешно");
        } catch (IOException e){
            e.printStackTrace();
            logger.warning("Что-то пошло не так");
        }
        finally {
            System.out.println("Bye!");
        }
    }

    static void readFile (String res, String pathFile){
        File f = new File(pathFile);
        try(Scanner scanner = new Scanner(f)) {
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static String repeat (String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++){
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }
}