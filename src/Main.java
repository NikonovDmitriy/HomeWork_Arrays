public class Main {
    public static void main(String[] args) {

        //1 задача
        //1
        int[] a = {1, 2, 3};
        for (int i = 0; i < a.length; i++) {
            if (i == a.length-1) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[i] + ", ");
            }
        }

        //2
        System.out.println("\n");
        double[] b = {1.57, 7.654, 9.986};
        for (int u = 0; u < b.length; u++) {
            if (u == b.length-1) {
                System.out.print(b[u] + " ");
            } else {
                System.out.print(b[u] + ", ");
            }
        }

        //3
        System.out.println("\n");
        int[] c = {1, 2, 3, 4, 5, 6, 7};
        for (int y = 0; y < c.length; y++) {
            if (y == c.length-1) {
                System.out.print(c[y] + " ");
            } else {
                System.out.print(c[y] + ", ");
            }
        }

        //3 задача
        System.out.println("\n");
        int[] d = {1, 2, 3};
        for (int h = d.length-1; h >= 0; h--) {
            if (h == 0) {
                System.out.print(d[h] + " ");
            } else {
                System.out.print(d[h] + ", ");
            }
        }

        //2
        System.out.println("\n");
        double[] e = {1.57, 7.654, 9.986};
        for (int k = e.length-1; k >= 0; k--) {
            if (k==0){
            System.out.print(e[k] + " ");
        } else {
            System.out.print(e[k] + ",");
        }
    }


        //3
        System.out.println("\n");
        int [] f = {1, 2, 3, 4, 5, 6, 7};
        for (int y = f.length-1; y >= 0; y--) {
            if (y == 0) {
                System.out.print(f[y] + " ");
            } else {
                System.out.print(f[y] + ", ");
            }
        }

        //4 задача
        System.out.println("\n");
        int[] t = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int g = 0; g < t.length; g++) {
            if (g % 2 ==0) {
                t[g]++;
                System.out.print(t[g] + " ");
            }
        }
    }
}


