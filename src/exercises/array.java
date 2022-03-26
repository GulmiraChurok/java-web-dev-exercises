package exercises;

public class array {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 5, 8};
        for(int i = 0; i < array1.length; i++) {
            if(!(array1[i] % 2 == 0)){
            System.out.println(array1[i]);}
        }

    }
}
