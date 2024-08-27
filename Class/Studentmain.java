public class Studentmain {
    int a;
    String n;
    public static void main(String[] args) {
        Studentmain s = new Studentmain();
        s.setData("Aaryan Choudhari",19);
        s.displayData();
    }
    public void setData(String name,int age){
        n=name;
        a=age;
    }
    public void displayData(){
        System.out.println("Name: "+n);
        System.out.println("Age: "+a);
    }

}
