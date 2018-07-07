import java.io.*;
class lbh
{
    public static void main(String args[])throws IOException
    {
        int l,b,h,TSA,volume;
        DataInputStream dis  = new DataInputStream(System.in);
        l=Integer.parseInt(dis.readLine());
        b=Integer.parseInt(dis.readLine());
        h=Integer.parseInt(dis.readLine());
        TSA=2*((l*b)+(b*h)+(h*l));
        volume= l*b*h;
        System.out.println(TSA);
        System.out.println(volume);
    }
}
