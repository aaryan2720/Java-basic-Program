
//define a class box with instance variable  height width length of double type write a program for calculating the area  and volumn of thr box with the constructor which is parameter
public class Box {
    static double height;
    static double width;
    static double length;
 


    public Box(double h, double l, double w){
        height=h;
        length = l;
        width = w;
    }

    public static void main(String[] args) {
        Box aBox = new Box(height, length, width);
        aBox.setHeight(10);
        aBox.setWidth(20);
        aBox.setLength(30);
        aBox.getArea();
        aBox.getVolumn();
        aBox.getHeight();
        aBox.getWidth();
        aBox.getLength();
       
        System.out.println("Area:"+aBox.getArea());
        System.out.println("Volumn: "+aBox.getVolumn());

    }

    public void setHeight(double h) {
        height = h;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setLength(double l) {
        length = l;
    }

    public double getArea() {
        double area = ((2 * length * width) + (2 * length * height) + (2 * height * width));
        return area;

    }

    public double getVolumn() {
        double volumns = height * length * width;
        return volumns;

    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    

    

}
