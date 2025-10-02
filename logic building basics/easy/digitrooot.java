public class digitrooot {
    public static void main(String[] args) {
        int a =5674;
        String b =String.valueOf(a);
        int sum=0;
        for(char e : b.toCharArray()){
            sum+=Integer.parseInt(String.valueOf(e));

        }
        System.out.println(sum);
        String root =String.valueOf(sum);
        if(root.length()==1){
            System.out.println(root);

        }
        else{
            int n = 0;
            for(char e :root.toCharArray()){
                n += Integer.parseInt(String.valueOf(e));

            }
            System.out.println(n);
        }
    }
}
