public class App2 {
    public static void main(String[] args) {
        double a = 5.0;
        int b = 3;

        double wynik = a/b;
        System.out.println(wynik);

        double d;
        d = b;

        System.out.println(d);

        double x = 5.5;
        int y = (int) x;

        System.out.println(y);

        boolean logiczna1 = true;
        boolean logiczna2 = false;

        boolean wynikLogiczny = logiczna1 || logiczna2;

        System.out.println(wynikLogiczny);

        boolean wynikLogiczny2 = !logiczna1;

        System.out.println(wynikLogiczny2);

        boolean wynik3 = logiczna1 ^ logiczna2;
        System.out.println(wynik3);
    }
}
