public class besttime {

    static void best(int[] prices){
        int i=0;
        int j=1;
        int n=prices.length;
        int maxprofit=0;
        int profit=0;

        while(j<n){
            if(prices[j]>prices[i]){
                profit=prices[j]-prices[i];
                maxprofit=Math.max(maxprofit, profit);
                System.out.println(profit);
                
            }
            else{i=j;}
            j++;
        }

        
        System.out.println(maxprofit);



    }
    public static void main(String[] args) {
        int []  ar={7,2,5,1,0,7};
        best(ar);
    }
}
