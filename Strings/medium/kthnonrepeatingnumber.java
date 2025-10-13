public class kthnonrepeatingnumber {
    public static void main(String[] args) {
        

        String a = "geeksforgeeks";
        int k = 3;
        int count=0;
        // boolean repeating =false; 


        for(int i=0;i<a.length();i++){
            boolean repeating =false;

            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    repeating=true;
                }
            }
            if(!repeating){
                count++;
                if(count==k){
                    System.out.println(a.charAt(i));
                }
            }

        }
         
    }
}
