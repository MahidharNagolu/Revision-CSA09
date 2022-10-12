import java.util.Scanner;

public class rev10

{

   public static void main(String args[])

    {

        int marks[] = new int[4];

        int p,c,m,py,b,a;

        float total=0, avg;

        Scanner s= new Scanner(System.in);

      System.out.print("Enter the marks in python: ");    py=s.nextInt();

        System.out.print("Enter the marks in c programming: ");

        c=s.nextInt();

      System.out.print("Enter the marks in Mathematics: ");

      m=s.nextInt();

      System.out.print("Enter the marks in Physics: ");

      p=s.nextInt();

System.out.print("Enter the marks in biology: ");

      b=s.nextInt();

System.out.print("Enter the marks in arts: ");

      a=s.nextInt();

      total=m+c+py+p+a+b;

        avg = total/6;

        System.out.print("The student Grade is:");

        if(avg>=75)

        {

           System.out.print("DISTINCTION");

        }

        else if(avg>=60 && avg<75)

        {

           System.out.print("FIRST DIVISION");

        }

        else if(avg>=50 && avg<60)

        {

            System.out.print("SECOND DIVISION");

        }

        else if(avg>=40 && avg<50)

        {

            System.out.print("THIRD DIVISION");

        }

        else if(avg>=0 && avg<40)

        {

            System.out.print("FAIL");

        }

       else 

       {

        System.out.print("INVALID");

        }

    }

}
