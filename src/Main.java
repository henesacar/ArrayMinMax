import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Bir değer girin: ");
        int input = scn.nextInt();
        int i = 0;
        int[] list = {5, 69, -9, 21, 36, 25, 87, 12, -20, -5};
        Arrays.sort(list);
        
        while (list[i] <= input) {
            i++;

        }
        System.out.println("Değerden en yakın küçük sayı: " + list[i - 1]);
        System.out.println("************");
        System.out.println("Değere en yakın büyük sayı: " + list[i]);
    }
}
