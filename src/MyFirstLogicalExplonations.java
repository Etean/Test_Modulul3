public class MyFirstLogicalExplonations {

    int h1 = 18;
    int h2 = 3;
    int min1 = 25;
    int i, j, a;

    public void clock() {
        for (i = 0; i < 4; i++) {
            System.out.print("|");
            if ((5 * (i + 1)) <= h1) {
                System.out.print(" H*5 ");
            } else System.out.println(" _ |");
        }
        for (j = 0; j < 4; j++) {
            System.out.print("|");
            if ((1 * (j + 1)) <= h2) {
                System.out.print(" h*1 ");
            } else System.out.print(" _ |");
        }
        System.out.println("\n");
        for (a = 0; a < 55; a++) {
            System.out.print("|");
            if ((5 * (a + 1)) <= min1) {
                System.out.print("min*5");
            } else System.out.print("_|");
        }
        System.out.println("\n");
        for (int sec = 0; sec <= 60; sec++) {
            if (sec % 2 == 0) {
                System.out.print(" O");
            } else if (sec == 19)
                System.out.print(" I");
        }
    }

}
