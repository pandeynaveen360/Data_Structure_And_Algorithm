package HashMaps_Concept;

import java.util.Scanner;

public class Check_Pair_Mod_K {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[sc.nextInt()];
        System.out.println(PairModKCheck(arr, k));
    }
    public static boolean PairModKCheck(int[] arr, int k){
        int[] freq = new int[k];
        // key -> index of the array
        // value - > element of that index
        for(int num : arr){
            num = num % k;
            if(num < 0) num += k;
            freq[num]++;
        }
        if(freq[0] % 2 != 0) return false;
        for(int i = 1; i < k/2; i++){
            if(freq[i] != freq[k-i]) return false;
        }
        return true;
    }
}
