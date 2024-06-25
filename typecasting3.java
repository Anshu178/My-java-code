public class typecasting3 {
    public static void main(String[] args) {
        System.out.println(10);//Integer literal is by default int
        System.out.println(10.2);// Flotingpoint Literal is by Default Double
        //floting a=6.2//error
        //flpoting a=(float)6.2;//allowed
        //floting a=6.2f;//allowed
        float a=6.2f;//allowed
        System.out.println(a);

        //double b=6.2;//allowed
        //double b=6.2d;//allowed
        double b=6.2D;//allowed
        System.out.println(b);

        //long x=200;//allowed
        //long x=2000000;//error
        long x=2000000L;
        System.out.println(x);
    }
}
