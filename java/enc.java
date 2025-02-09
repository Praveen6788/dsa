public class enc {
    private String name;

    public enc(String name){
        this.name=name;

    }

    public String geString(){
        return name;
    }
    public void seString(String newname){
        this.name=newname;
    }

    public static void main(String[] args) {
        enc a =new enc("praveen");
        System.out.println(a.geString());

        a.seString("Grandhi");
        System.out.println(a.geString());
    }



}
