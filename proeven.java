import java.io.*;
class proeven
{
    public static void main(String args[])throws IOException
    {
        int n1,n2,result;
        DataInputStream dis = new DataInputStream(System.in);
        n1=Integer.parseInt(dis.readLine());
        n2=Integer.parseInt(dis.readLine());
        result=n1*n2;
        if(result%2==0)
        {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }
}
