import java.util.*;
import java.io.*;

class stringQuestion{
	char[] query = new char[100];
	char[] count = new char[100];
	count[100] = {'0'};
	void getQuery(char query[]){
		this.query = query;
	}
	void find(){
	int j=0;
	int i=0;
	while(query[i]==query[i+1]){
			count[j]=query[i];
			count[j+1]++;
			if(query[i]!=query[i+1]){
				j++;
				}
			i++;
			}
	}
	void display(){
		for(int temp=0;temp<count.length;temp++){
			System.out.println(count[temp]);
		}
	}
	public static void main(String[] args) throws IOException{
		String query;
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		stringQuestion str = new stringQuestion();
		query = bc.readLine();
		char[] queryy = query.toCharArray();
		str.getQuery(queryy);
		str.find();
		str.display();
	}	
}