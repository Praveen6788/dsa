public class perfectnpo {
    public static void main(String[] args) {
        int n=6;
        int sum=1;
        // for(int i=2;i<n;i++){
        //     if(n%i==0){
        //         sum+=i;
        //     }
        // }
        // 

        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                if(i*i!=n){
                    sum=sum+i+n/i;
                }
                else{
                    sum+=i;
                }
            }
        }
        if(sum==n){
            System.out.println("perfect");
        }
        else{
            System.out.println("not Perfecct");
        }
    }
}
