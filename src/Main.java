public class Main {
    public static void main(String[] args) {

        //1 задача
        //1
        int [] a = {1, 2, 3};
        for (int i = 0; i<3; i++) {
            if (i==2){
                System.out.print(a[i]+" ");
            } else {
                System.out.print(a[i]+",");
            }
        }

        //2
        double [] b = new double[]{1.57, 7.654, 9.986};
        for (double u = 0.0; u < 3.0; u++) {
            System.out.print(b[(int) u] + ",");
        }

        //3
        int [] c = {1, 2, 3, 4, 5, 6, 7};
        for (int y = 0; y < 7; y++) {
            System.out.print(c[y]+",");
        }







    }
