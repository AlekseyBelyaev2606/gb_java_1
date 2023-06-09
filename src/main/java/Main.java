import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String [] args) throws IOException {
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);


        String k = Integer.toBinaryString(i);
        System.out.println(k);
        char first = k.charAt(0);
        System.out.println(first);


        System.out.println("Введите число n:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(n);
        int z = i;

        int[] m1Temp = new int[Short.MAX_VALUE];
        int counter = 0;
        while (z < Short.MAX_VALUE) {
            if (z % n == 0) {
                m1Temp[counter] = z;
                counter++;
            }
            z++;
        }
        int [] m1 = Arrays.stream(m1Temp).filter(x -> x != 0).toArray();
        System.out.println(Arrays.toString(m1));


        int[] m2Temp = new int[Short.MAX_VALUE];
        z = i;
        counter = 0;
        while (z > Short.MIN_VALUE) {
            if (z % n != 0) {
                m2Temp[counter] = z;
                counter++;
            }
            z--;
        }
        int [] m2 = Arrays.stream(m2Temp).filter(x -> x != 0).toArray();
        System.out.println(Arrays.toString(m2));
    }

}
