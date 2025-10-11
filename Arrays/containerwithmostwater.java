public class containerwithmostwater {
    public static void main(String[] args) {

        int height[]={1,8,6,2,5,4,8,3,7};

        int l=0;
        int r=height.length-1;
        int maxarea=0;


        while (l<r){
            int area =Math.min(height[l], height[r])*(r-l);

            maxarea=Math.max(maxarea, area);
            if(height[l]>height[r]){
                r--;
            }
            else{
                l++;


            }

        }
        System.out.println(maxarea);
        
    }
}
