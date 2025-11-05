import java.lang;
public class MultiCatch 
{
    public static void main(String[] args)
    {
        try
        {
            int a = args.length;
            System.out.println("a =" + a);
            int b = 42/a;
            int c[] = {21,29};
            c[21] = 99;
        }
        catch (ArthimeticException e)
        {
            System.out.println("Divide by zero " +e);
        }
        catch (ArrayIndexOutofBoundsException Arobj)
        {
            System.out.println("Array Index Object" + Arobj);
        }
        System.out.println("After try catch block");
    }   
}
