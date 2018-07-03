import java.io.*;
class add6
{
    public static void main(String args[])throws IOException
    {
        int num1,num2,sum=0;
        DataInputStream dis = new DataInputStream(System.in);
        num1=Integer.parseInt(dis.readLine());
        num2=Integer.parseInt(dis.readLine());
        sum=num1+num2;
        System.out.println(sum);
        if(sum%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
