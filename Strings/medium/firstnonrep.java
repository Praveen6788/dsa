
public class firstnonrep {
    public static void main(String[] args) {
        String a ="geeksforgeeks";

        

        for(int i=0;i<a.length();i++){
            boolean b =false;
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)){
                    b=true;
                }
            }
            if(b==false){
                System.out.println(a.charAt(i));
                break;
            }
        }
    }
}
