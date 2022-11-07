public class App6 {
    public static void main(String[] args) {
        int[] tab = new int[100];

        int cos;
        for(int i = 0; i < 100; i++) {
            tab[i] = i;
        }

        /*for(int i = 0; i < 100; i++) {
            //System.out.printf("element %d: %d\n",i,tab[i]);
            System.out.println("element " + i + ": " + tab[i]);
        }*/

        for(int element : tab) {
            System.out.println("element:" + element);
        }

        System.out.println("po petli !!");

        int a = 101;
        do {
            System.out.println("cos !!");
            a++;
        } while(a < 100);


    }
}
