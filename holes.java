import java.io.*;
class number_holes{
public static void main(String args[])throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	int n=Integer.parseInt(br.readLine());
	int number=0;
	int [] a=new int[n];
	for(int i=0;i<n;i++)
	{
	a[i]=Integer.parseInt(br.readLine());
	}
	for(int i=0;i<n;i++)
	{
	if(a[i]==8){
	number+=2;
	break;
	}
	else if(a[i]==0||a[i]==4||a[i]==6||a[i]==9){
	number++;
	break;
	}
	else
	number=0;
	}
	System.out.println(number);
	}
}