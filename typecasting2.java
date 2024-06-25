class Typecasting2 {
    public static void main(String[] args) {
        char a='h';
        //char a='\u0069';
        System.out.println(a);
        int b=a;//Implicit: Upcasting oe widening
        System.out.println(b);

        int x=104;
        System.out.println(x);
        //char y=x;//error
        char y=(char)x;//Explicit: Downcasting or Narrowing
        System.out.println(y);
    }
    
}
