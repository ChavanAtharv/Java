import java.lang.*;     // Default packahge in java

class Demo
{
     public void fun()     
     {
          System.out.println("Fun without parameters");
     }
     public void fun(int i)     
     {
          System.out.println("Fun one parameter");
     }
     public void fun()     
     {
          System.out.println("Fun without parameters");
     }
     public void fun(double i)     
     {
          System.out.println("Fun without parameters");
     }
}   

class Overloading
{
          public static void main(String arg[])
          {
               Demo obj = new Demo();
               obj.fun();
               obj.fun();
               obj.fun();
               obj.fun();
          }
}