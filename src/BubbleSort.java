import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите количество элементов массива: ");
        int size = input.nextInt();
        int arr[] = new int[size];
        System.out.println("Введите элементы массива:");

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }



        for (int j= 0; j < arr.length - 1; j++) {
            for (int i = j; i < arr.length -1; i++) {
                if (arr[i] < arr[i + 1]){
                    swap(arr, i);
                }
            }
        }
        System.out.println("Отсортированный массив: ");
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int array[], int i) {
        int tmp = array[i];
        array[i] = array[(i + 1)];
        array[(i + 1)] = tmp;
    }
}

