import java.util.Scanner;
import java.io.*;
class buffer
{
public static void main(String args[]) throws IOException
{
double celsius;
double fahrenheit=0.0;
BufferedReader sc= new BufferedReader(new InputStreamReader(System.in));
fahrenheit= Double.parseDouble(sc.readLine());
celsius=(fahrenheit-32.0)*(5.0/9.0);
System.out.println(celsius);
}
};