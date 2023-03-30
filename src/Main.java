import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        int[] arrayForSort = new int[10];
        for (int i = 0; i < arrayForSort.length; i++) {
            int random = ThreadLocalRandom.current().nextInt(0, 10);
            arrayForSort[i] = random;
        }
        printArray(arrayForSort);
        countingSort(arrayForSort);
        System.out.println();
        printArray(arrayForSort);
    }
    public static void printArray(int[] array){
        for (int i = 0; i< array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public static void countingSort(int[] array){
        int[] counter = new int[11];
        for (int i = 0; i < array.length; i++){
            int tmp  = array[i];
            counter[tmp]++;
        }
        int i = 0;
        for (int j = 0; j < counter.length; j++){
            int tmp2 = counter[j];
            while (tmp2 >0){
                array[i] = j;
                tmp2--;
                i++;
            }

        }
    }

}