package geometricobject;

public class Rectangle {
    private double width=0;
    private double height=0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        if(width>0 && height>0){
            this.width = width;
            this.height = height;
        }  
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0){
            this.width = width;
        } 
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height>0){
            this.height = height;
        } 
        
    }
    
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
    
}
