public class Main {
    public static void main(String[] args) {

        //1 задача
        //1
        int[] a = {1, 2, 3};
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        //2
        System.out.println("\n");
        double[] b = {1.57, 7.654, 9.986};
        for (double u = 0.0; u < 3.0; u++) {
            if (u == 2) {
                System.out.print(b[(int) u] + " ");
            } else {
                System.out.print(b[(int) u] + ", ");
            }
        }

        //3
        System.out.println("\n");
        int[] c = {1, 2, 3, 4, 5, 6, 7};
        for (int y = 0; y < 7; y++) {
            if (y == 6) {
                System.out.print(c[y] + " ");
            } else {
                System.out.print(c[y] + ", ");
            }
        }

        //3 задача
        System.out.println("\n");
        int[] d = {1, 2, 3};
        for (int h = 2; h >= 0; h--) {
            if (h == 0) {
                System.out.print(d[h] + " ");
            } else {
                System.out.print(d[h] + ", ");
            }
        }

        //2
        System.out.println("\n");
        double[] e = {1.57, 7.654, 9.986};
        for (double k = 2.0; k >= 0.0; k--) {
            if (k==0){
            System.out.print(e[(int) k] + " ");
        } else {
            System.out.print(e[(int) k] + ",");
        }
    }


        //3
        System.out.println("\n");
        int [] f = {1, 2, 3, 4, 5, 6, 7};
        for (int y = 6; y >= 0; y--) {
            if (y == 0) {
                System.out.print(f[y] + " ");
            } else {
                System.out.print(f[y] + ", ");
            }
        }

        //4 задача
        System.out.println("\n");
        int[] t = {1, 2, 3};
        for (int g = 0; g < 3; g++) {
            if (g % 2 != 1) {
                System.out.print(t[g]+1+" ");
            }
        }
    }








        }


