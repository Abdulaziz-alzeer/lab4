public class Traingle extends Shape   {

    private double height ;
    private double base ;

    public Traingle(double height ,double base) {
        this.height = height;
        this.base=base;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }


    @Override
    public double calculater_area() {
        return 0.5*base*height ;
    }

    @Override
    public double calculate_circumference() {
        return  0.5*base*height;
    }
}
