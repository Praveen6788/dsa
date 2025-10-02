public class checkpower {
    public static void main(String[] args) {
        int x=10;
        int y=1000;

        if (y==1){
            System.out.println("power");
        }
        else{
            if(y%x!=0){
                System.out.println("not power");
            }
            else{
                
                // int z=0;
                // int v=0;
                // while(v<=y){
                //     v = ( int)Math.pow(x,z);
                //     if(v==y){
                //         System.out.println("p0wer");
                //     }
                //     z+=1;
                // }
                int pow=1;
                while(pow<y){
                    pow*=x;
                    if(pow==y){
                        System.out.println("power");
                    }
                }

        //         double res1 = Math.log(y) / Math.log(x);
        // return res1 == Math.floor(res1);

            }

        }
    }
}
