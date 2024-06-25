class IntegerLiteral {
public static void main(String[] args) {
    int a=104;//Decimal Integer Literal
    int b=0150;//Octal Integer Litereal
    int c=0x60;//Hexa-Decimal Integer Litereal
    //int c=0X68;//allowed
    int d=0b1101000;//Binary Integer Litereal
    //int d=)B1101000;//allowed
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
    System.out.println(d);
    int x=45_21_74_5_12;
    //int x=45___________21___74____________5_______12;//allowed
    //int x=_45______21_____74____5___12;//not allowed error
    System.out.println(x);
    }
}