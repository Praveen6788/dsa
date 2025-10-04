public class mice {
    public static void main(String[] args) {

        Collections.sort(A);
        Collections.sort(B);
        
        List<Integer> lis = new ArrayList<>();
        for(int i=0;i<A.size()-1;i++){
            lis.add(Math.abs(A.get(i)-B.get(i)));

            
        }
        Collections.sort(lis);
        return lis.get(lis.size()-1);
    }
    }
}
