class typecasting1 {
    public static void main(String[] s){
        int a=104;
        System.out.println(a);
        double b=a;// Implicit: Upcasting or Widening
        System.out.println(b);

        double x=12.0;
        System.out.println(x);
        int y=(int)x;//Explicit: Downcasting
        System.out.println(y);
    }
}
