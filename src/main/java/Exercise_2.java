import java.security.PublicKey;

public class Exercise_2 {
    public static void main(String[] args) {
        byte[] arrByte = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};                     //Задание 1
        replacement(arrByte);
        for (byte b : arrByte) {
            System.out.print(" " + b);
        }
        System.out.println();
        int[] arrInt = new int[8];                                          //Задание 2
        filling(arrInt);
        printArr(arrInt);
        int[] arrInt2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};              //Задание 3
        x2(arrInt2);
        printArr(arrInt2);
        int[][] squareArr = new int[10][10];                                //Задание 4
        diagonal(squareArr);
        printArrSquare(squareArr);
        int[] arrInt3 = {2, 5, 7, 9, 10, 23, 5, 6, 7, 8, 99, 54, 1, 73, 0}; //Задание 5
        max_min(arrInt3);

        int[] arrInt4 = {2, 1, 1, 2, 1};                                    //Задание 6
        System.out.println(checkBalance(arrInt4));

        shiftArray(arrInt3, 1);                                        //Задание 7
    }

    public static void replacement(byte[] arr){         //Метод для задания 1
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
    }
    public static void filling(int[] arr){              //Метод для задания 2
        int j = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = j;
            j += 3;
        }
    }
     public static void x2(int[] arr){                  //Метод для задания 3
        for(int i = 0; i < arr.length; i++){
            if (arr[i] < 6){
                arr[i] *= 2;
            }
        }
     }
     public static void diagonal(int[][] arr){          //Метод для задания 4
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][i] = 1;
            }
        }
     }
     public static void max_min(int[] arr){             //Метод для задания 5
        int max = arr[0];
        int min = arr[0];
        for (int i =0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
            else if (arr[i] < min){
                min = arr[i];
            }
        }
         System.out.println("Максимальный элемент массива " + max);
         System.out.println("Минимальный элемент массива " + min);
     }
     public static boolean checkBalance(int[] arr){     // Метод для задания 6
        int left, right ;
        for (int i = 0; i < arr.length + 1; i++){
          left = 0;
          right = 0;
          for (int j = 0; j < i;j++){
              left += arr[j];
          }
          for (int j = i; j < arr.length; j++){
              right += arr[j];
          }
          if (left == right){
              return true;
          }
        }
        return false;
     }

     public static void shiftArray(int[] arr, int shift){ // Метод для залания 7
        if (shift > 0){
            for (int i = 0; i < shift;i++){
                int q = arr[arr.length - 1];
                if (arr.length - 1 >= 0){
                    System.arraycopy(arr, 0, arr, 1, arr.length - 1);
                }
                arr[0] = q;
                for (int j : arr) System.out.print(j + " ");
                System.out.println();
            }
        }
        if (shift < 0){
            for (int i = 0; i > shift; i--){
                int q = arr[0];
                System.arraycopy(arr, 1, arr, 0, arr.length - 1);
                arr[arr.length - 1] = q;
                for (int j : arr) System.out.println(j + " ");
                System.out.println();
            }
        }
     }


    public static void printArrSquare(int[][] arr) {    //Печать двумерного массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void printArr(int[] arr){             //Печать одномерного массива
        for (int a : arr){
            System.out.print(" " + a);
        }
        System.out.println();
    }
}
