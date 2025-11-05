class Rectangle {
    int length, breadth;

    void getdata(int l, int b) {
        length = l;
        breadth = b;
    }

    int area() {
        int a = length * breadth;
        return a;
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        int area1, area2;

        Rectangle R1 = new Rectangle();
        R1.getdata(10, 20);
        area1 = R1.area();
        
        Rectangle R2 = new Rectangle();
        R2.length = 30;   
        R2.breadth = 40;  
        area2 = R2.length * R2.breadth;

        System.out.println("Area of Rectangle 1 = " + area1);
        System.out.println("Area of Rectangle 2 = " + area2);
    }
}