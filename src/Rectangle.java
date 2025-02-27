public class Rectangle extends Shape {
    private double hieght ;
    private double width ;

    public Rectangle(double hieght , double width) {
        this.hieght = hieght;
        this.width=width;
    }

    public double getHieght() {
        return hieght;
    }

    public void setHieght(double hieght) {
        this.hieght = hieght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    @Override
    public double calculater_area() {
        return hieght*width;
    }

    @Override
    public double calculate_circumference() {
        return 2*(hieght+width);
    }
}
