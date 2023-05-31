import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;
import java.util.Scanner;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    public enum Se {
        START, END;
    }

    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        List<Integer> valueList = new ArrayList<>();
        try (FileReader fr = new FileReader(path);
                BufferedReader br = new BufferedReader(fr)) {
            String line;
            while ((line = br.readLine()) != null) {
                valueList.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Integer value : valueList) {
            System.out.println(value);
        }
    }

    public static void main(String... args) {
        logger.info(Se.START.name());
        new TextReader(args[0]).execute();
        logger.info(Se.END.name());
    }

}