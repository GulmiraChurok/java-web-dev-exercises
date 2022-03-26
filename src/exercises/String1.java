package exercises;

import java.util.Arrays;

public class String1 {
        public static void main(String[] args) {
            String example = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
            String[] array2;
            array2 = example.split(" ");
//            for (int i = 0; i < array2.length; i++){
//                System.out.print(array2[i] + ", ");
//            }
            System.out.println((Arrays.toString(array2)));
        }
}


