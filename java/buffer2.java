import java.io.*;
class buffer2
{
public static void main(String args[]) throws IOException
{
BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
int t = Integer.parseInt(in.readLine());
for(int i =0;i<t;i++)
{
String s = in.readLine();
int[] m= new int[2];
m[0]=Integer.parseInt(in.readLine());
m[1]=Integer.parseInt(in.readLine());
        System.out.println(s);
        System.out.println(m[0]);
        System.out.println(m[1]);
    }
}
}