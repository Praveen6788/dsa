public class maxsubarray {
    public static void main(String[] args) {
        int[] arr={2,3,-8,7,-1,2,3};


        int maxsum=0;
        int res=0;

        for(int i=0;i<arr.length;i++){
            res+=arr[i];
            if (res<0){
                res=0;

            }
            maxsum=Math.max(maxsum, res);
        }
        System.out.println(maxsum);

    }
    
}
