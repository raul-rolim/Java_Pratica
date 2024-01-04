package Exercicio_pratica2;

public class Exercicio1 {

    public static void main(String[] args) {
//        String grid = "";
//        for(int i=0; i<10; i++) {
//            for(int j=0; j<10; j++) {
//                grid = grid + "- ";
//            }
//            grid= grid + "\n";
//        }
//        System.out.println(grid);

//        int[] values = new int[3];
//        values[0] = 3;
//        values[1] = 6;
//        values[2] = 8;
//        int sum = 0;
//        for(int i = 0; i< values.length; i++) {
//            sum = sum + values[i];
//        }
//        System.out.println("Result: " + sum);

        double[] average = new double[5];
        average[0] = 9;
        average[1] = 5;
        average[2] = 6;
        average[3] = 3;
        average[4] = 8;
        double sum=0;
        for(int i=0;i<average.length;i++) {
            sum = sum + average[i];
        }
        System.out.println(sum/average.length);


    }
}
