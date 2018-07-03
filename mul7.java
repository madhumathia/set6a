import java.io.*;
class mul7
{
    public static void main(String args[])throws IOException
    {
        int number;
        DataInputStream dis = new DataInputStream(System.in);
        number=Integer.parseInt(dis.readLine());
        if(number%7==0)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
