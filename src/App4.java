public class App4 {
    public static void main(String[] args) {
        int liczba1 = 1;
        int liczba2 = 5;
        int liczba3 = 20;

        int[] liczby = new int[10];
        liczby[0] = 5;
        liczby[1] = 15;
        liczby[5] = 40;

        int wynik = liczby[0] + liczby[5];
        System.out.println(wynik);

        int[][] liczby2D = new int[10][10];

        liczby2D[0][0] = 15;
        liczby2D[4][8] = 40;
        liczby2D[2][5] = 55;

        wynik = liczby2D[0][0] + liczby2D[4][8];
        System.out.println(wynik);

        int[][][] liczby3D = new int[5][15][3];

        liczby3D[0][1][2] = 34;

        System.out.println(liczby3D[0][0].length);

        int[][] czescTablicy3D = liczby3D[0];

        int[] tablicaJednowymiarowa = czescTablicy3D[0];

        int x = tablicaJednowymiarowa[0];
    }
}
