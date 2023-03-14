//ELISANDRA NUR PN QEC
//NOMOR 2

import java.util.Arrays;
public class work2 {
    public static void countFreq(int arr[], int n)
    {
        boolean visited[] = new boolean[n];
        Arrays.fill(visited, false);
        // menghitung frekuensi nilai array
        for (int i = 0; i < n; i++) {

            if (visited[i] == true)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            if(count==1)
                System.out.println(arr[i]);
        }
    }

    public static void main(String []args)
    {
        int arr[] = new int[]{1,1,2,2};
        int n = arr.length;
        countFreq(arr, n);
    }
}
