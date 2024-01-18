package CoreJava.src.Practics_Questions;

public class Print_Diagonal_Elements_2D_Array {
    public static void main(String[] args) {

    int [][] array_2D = new  int[3][3];

    array_2D[0][0] = 101;
    array_2D[0][1] = 102;
    array_2D[0][2] = 103;

    array_2D[1][0] = 201;
    array_2D[1][1] = 202;
    array_2D[1][2] = 203;

    array_2D[2][0] = 301;
    array_2D[2][1] = 302;
    array_2D[2][2] = 303;
                        // 1 Method
//        for (int i = 0; i <array_2D.length ; i++) {
//            System.out.print("\t" + array_2D[i][i]);
//
//
//        }
//        System.out.println();

                        // 2 Method
//        for (int i = 0; i <array_2D.length ; i++) {
//            for (int j = 0; j <array_2D[i].length ; j++) {
//                System.out.print("\t" + array_2D[i][j]);
//
//            }
//            System.out.println();
//
//        }

                // 3 Method
        for (int i = 0; i <array_2D.length ; i++) {
            for (int j = 0; j <array_2D[i].length ; j++) {
                if (i == j){
                    System.out.print("\t" + array_2D[i][j]);
                }

            }

        }

    }
}
