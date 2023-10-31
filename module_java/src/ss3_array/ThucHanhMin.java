package ss3_array;

public class ThucHanhMin {
    public static int minValue(int[] array){
        int min = 0;
        for (int i = 0; i < array.length; i++){
            if (array[min] < array[i]){
                min = i;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        int[] array = {3,6,5,78,5,4,3};
        int min = minValue(array);
        System.out.print("min in  array: " + min);
    }
}
