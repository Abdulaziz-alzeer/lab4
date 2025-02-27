import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner =new Scanner(System.in);

        /        Shape s1=new Circle(10);
//        System.out.println("calculate area :"+s1.calculater_area()+" and calculate_circumference: "+s1.calculate_circumference());
//        System.out.println();
//
//        Shape s2=new Circle(25);
//        System.out.println("calculate area :"+s2.calculater_area()+" and calculate_circumference: "+s2.calculate_circumference());
//        System.out.println();
//
//        Shape s3=new Traingle(9,10);
//        System.out.println("calculate area :"+s3.calculater_area()+" and calculate_circumference: "+s3.calculate_circumference());
//        System.out.println();
//
//        Shape s4=new Traingle(4,3);
//        System.out.println("calculate area :"+s4.calculater_area()+" and calculate_circumference: "+s4.calculate_circumference());
//        System.out.println();
//
//        Shape s5=new Rectangle(12,8);
//        System.out.println("calculate area :"+s5.calculater_area()+" and calculate_circumference: "+s5.calculate_circumference());
//        System.out.println();
//
//        Shape s6=new Rectangle(14.5,6.5);
//        System.out.println("calculate area :"+s6.calculater_area()+" and calculate_circumference: "+s6.calculate_circumference());
//
//        System.out.println("enter a number");
//        double radius_n=scanner.nextDouble();
//        Shape s7=new Circle(radius_n);
//        System.out.println("calculate area :"+s7.calculater_area()+" and calculate_circumference: "+s7.calculate_circumference());
//        System.out.println();
//
//        System.out.println("enter a first number ");
//        double hieght_n=scanner.nextDouble();
//        System.out.println("enter a second number ");
//        double base_n=scanner.nextDouble();
//        Shape s8=new Traingle(hieght_n,base_n);
//        System.out.println("calculate area :"+s8.calculater_area()+" and calculate_circumference: "+s8.calculate_circumference());
//        System.out.println();
//
//        System.out.println("enter a first number ");
//        double hiegh_n=scanner.nextDouble();
//        System.out.println("enter a second number ");
//        double width_n=scanner.nextDouble();
//        Shape s9=new Rectangle(hiegh_n,width_n);
//        System.out.println("calculate area :"+s9.calculater_area()+" and calculate_circumference: "+s9.calculate_circumference());


        while (true) {
            System.out.println("please enter choice of these service or 'close' to exit ");
            System.out.println(" calculate area and calculate circumference of Circle enter '1' ");
            System.out.println(" calculate area and calculate circumference of Triangle enter '2' ");
            System.out.println(" calculate area and calculate circumference of Rectangle enter '3' ");
            int ans = scanner.nextInt();
            if (ans == 0) {
                System.out.println("thank you ");
                break;
            } else {
                switch (ans) {
                    case 1:
                        System.out.println("please enter a a radius of Circle ");
                        double rad_n = scanner.nextDouble();
                        Shape s1 = new Circle(rad_n);
                        System.out.println("calculate area :" + s1.calculater_area() + " and calculate_circumference: " + s1.calculate_circumference());
                        break;
                    case 2:
                        System.out.println("enter a height of Triangle ");
                        double hig_t = scanner.nextDouble();
                        System.out.println("enter a base of Triangle ");
                        double base_t = scanner.nextDouble();
                        Shape s2 = new Traingle(hig_t, base_t);
                        System.out.println("calculate area :" + s2.calculater_area() + " and calculate_circumference: " + s2.calculate_circumference());
                        break;
                    case 3:
                        System.out.println("enter a height of Rectangle ");
                        double hig_r = scanner.nextDouble();
                        System.out.println("enter a width of triangle ");
                        double width_r = scanner.nextDouble();
                        Shape s3 = new Traingle(hig_r, width_r);
                        System.out.println("calculate area :" + s3.calculater_area() + " and calculate_circumference: " + s3.calculate_circumference());
                        break;
                    default:
                        System.out.println("wrong entered ");
                        break;
                }
            }
        }


    }
}

       














    
