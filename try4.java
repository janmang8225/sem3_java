class A implements A1
{
    
}
class B implements B1
{

}
class C implements C1
{

}
class D implements D1
{

}
class E extends D
{
    double Calc()
    {
        return (double)(a*b*c*d);
    }
}
interface A1 
{
    int a = 20;
}
interface B1 extends A1
{
    float b = 12.5f;
}
interface C1 extends A1
{
    double c = 12.5;
}
interface D1 extends B1 , C1
{
    long d = 50L;
}


public class try4 {
    public static void main(String[] args) {
        E e = new E();
        // e.Calc();
        System.out.println(e.Calc());
    }
}
