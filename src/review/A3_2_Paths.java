package review;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

public class A3_2_Paths {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(Paths.get("src/review/A3_2_Paths.txt"), "UTF-8")) {
            //String string = scanner.nextLine();

            //System.out.println(string);
            //System.out.println(scanner.hasNextFloat());
            //System.out.println(scanner.nextLong());

            PrintWriter writer = new PrintWriter("src/review/A3_2_Paths.txt", "UTF-8");
            writer.println("jjf1");
            writer.println("jjf2");
            writer.println(" + jjf3");
            writer.write("jjf1");
            writer.append("jjf1 + jjf2 = jjf3");
            //writer.
            writer.write((int)97);

            writer.close();
        } catch (IOException e) {
            System.out.println("异常");
        }
        int f;

    }
}
