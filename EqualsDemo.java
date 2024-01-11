class EqualsDemo
{
    public static void main(String Arg[])
    {
        String s1 = "Hello";
        String s2 = "Hello";

        System.out.println("Hashcode of s1 : "+s1.hashCode());
        System.out.println("Hashcode of s1 : "+s2.hashCode());

    if(s1.equals(s2))
    {
        System.out.println("Objects are same");
    }
    else
    {
        System.out.println("Objects are different");
    }
    if(s1 == s2)
    {
        System.out.println("Objects are same");
    }
    else
    {
        System.out.println("Objects are different");
    }
    }
}