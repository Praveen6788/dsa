import java.util.*;

public class majorityelement {
    // static void majorele(int[] ar) {
    //     int n = ar.length;
    //     if (n <= 1) {
    //         System.out.println(Arrays.toString(ar));
    //     } else {
    //         Map<Integer, Integer> a = new HashMap<>();

    //         for (int i = 0; i < n; i++) {
    //             a.put(ar[i], a.getOrDefault(ar[i], 0) + 1);
    //         }
    //         int k = Collections.max(a.values());
    //         System.out.println(k);
    //         for (int b : a.keySet()) { // ✅ keySet() gives a Set of all keys
    //             if (a.get(b) == k) {
    //                 System.out.println(b);
    //             }
    //         }

    //     }

    // }


    static void majorele(int arr[]){
        int n= arr.length;
        int maxele=0;
        Arrays.sort(arr);
        int count=1;
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n-1;i++){
            if (arr[i]==arr[i+1]){
                count++;

            }
            else if (arr[i]!=arr[i+1]){
                count=1;
            }
            if (count>n/2){
                System.out.println(arr[i]);
            }
            
            

        }
        

    }



    public static void main(String[] args) {
        int[] arr = { 3, 2, 3 };
        int[] arr2 = { 2, 2, 1, 1, 2, 2 };

        majorele(arr2);
    }
}
