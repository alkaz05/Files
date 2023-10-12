import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String inputFName = "tr.txt";
        Scanner scanner = new Scanner(new File(inputFName));
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int perim = a+b+c;

        String outputFName = "perimeter";
        String s = String.valueOf(perim);
        Files.writeString(Path.of(outputFName), s);
    }
}