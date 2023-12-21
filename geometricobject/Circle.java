package geometricobject;

public class Circle {
    private double radius=0;
    
    public Circle(){
    }
    
    public Circle(double radius) {
        if(radius>0){
           this.radius = radius; 
        }
    }

    public void setRadius(double radius) {
        if(radius>0){
           this.radius = radius; 
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
