import java.io.*;
import java.util.Arrays;

class Author{
	String name;
	String email;
	char gender;

	Author(String name, String email,char gender){
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	String getName(){
		return this.name;
	}

	String getEmail(){
		return this.email;
	}

	void setEmail(String email){
		this.email = email;
	}

	char getGender(){
		return this.gender;
	}

	@Override
	public String toString(){
		return "Author[name="+name+",email="+email+",gender="+gender+"]";
	}

}

class Book{
	String name;
	double price;
	Author author[];
	int qty = 0;

	Book(String name,Author[] author,double price){
		this.name = name;
		this.author = Arrays.copyOf(author,author.length);
		this.price = price;9
	}

	Book(String name,Author[] author,double price,int qty){
		this.name = name;
		this.author = Arrays.copyOf(author,author.length);
		this.price = price;
		this.qty = qty;
	}

	String getName(){
		return this.name;
	}

	Author getAuthors(){
		for(int i=0;i<author.size;i++){
		return this.author[i];
		}
	}

	double getPrice(){
		return this.price;
	}

	void setPrice(double price){
		this.price = price;
	}

	int getQty(){
		return this.qty;
	}

	void setQty(int qty){
		this.qty = qty;
	}

	@Override
	public String toString(){
		return "Book[name="+name+"],price="+price+",qty="+qty+"]";
	}

	public static void main(String args[]) throws IOException{
		int size;
		BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
		size = Integer.parseInt(bc.readLine());
		Author[] author = new Author[size];	
		for(int i=0;i<size;i++)
			author[i] = new Author("Tanish","t@gmail.com", 'M');
		Book bk = new Book("abc",author,100);
		String s = bk.toString();
		System.out.println(bk);
	}	
}