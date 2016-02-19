package Abstract;

public class Main {
	public static void main(String args[]){
		AnimalList alo = new AnimalList();
		Dogs d = new Dogs();
		Fish f = new Fish();
		
		alo.add(d);
		alo.add(f);
		alo.add(d);
		alo.add(f);
		alo.add(d);
		alo.add(f);
		alo.add(d);
	}
}