import java.util.*;
public class movingzeros {
    public static void move(int[] arr){
        if(arr.length<=1){
            System.out.println(Arrays.toString(arr));
        }
        
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    
    }
    public static void main(String[] args) {
        int[] arr ={0,1,0,3,1,2};
        int[] arr2 ={1};

        move(arr);
        
    }
}
