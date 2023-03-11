class Rectangle {
    double length=10;
    double breadth=30;

    double calculateArea(){
        return length*breadth;
    }
}

class Rectangle_Main{
    public static void main(String[]args) {
        double area;
        // object creation creates the default construtor automatically without visible.
        Rectangle myrec =new Rectangle();
        area =myrec.calculateArea();
        System.out.println("The area of the Rectangle :" +area);
    }
}
