package ifmo.labs.compilers.lab1;

/**
 * Created by Andrey on 14.11.2017.
 */
public class Main {

    public static void main(String[] args) {
        try {
            Scanner.scan("resources/program.txt", "resources/out.txt");
            System.out.println(SyntaxAnalyzer.analyze(Scanner.getSymbols()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}