package Abstract;

public class Second {
	private String girlname;
	
	public void setname(String name){
		girlname = name;
	}
	
	public String getname(){
		return girlname;
	}
	
	public void print(){
		System.out.printf("Your Abstract.First GF was %s", getname());
	}
}
