import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HW {
    public static void main(String[] args) {
        int[] arr = {1, 7, 100, 11, 18, 54};
        int max = arr[0];
        for (int i = 0; i < 6; i++)
        {
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max);
    }
}