public class closestnumber {
    public static void main(String[] args){
        int a=-15;
        int m=6;
        int c=(a/m);
        
        int back=m*(c);
        int front = a*m>0? m*(c+1):m*(c-1);


        System.out.println(front+" "+back);
        
        if(Math.abs(a)%m==0){
            System.out.println(a);
        }
        else if( Math.abs(a-front) < Math.abs(a-back)){
            System.out.println(front);
            
        }
        else if(Math.abs(a-front) == Math.abs(a-back)){
            System.out.println(front);
        }
        else{
            System.out.println(back);
        }
    }
}
