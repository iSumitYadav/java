package Abstract;

public class AnimalList {
	
	private Animals[] thelist = new Animals[5];
	private int i = 0;
	
	public void add(Animals a){
	/*	if(i >= 5){//WHY THE FUCK is this printing the statement 5 times with 6 objects?
			System.out.println("List Memory is FULL!");
		}
		
		while(i < thelist.length){
			thelist[i] = a;
			System.out.println("Animal added at index " + i);
			i++;
		}*/
		
		if(i < thelist.length){
			thelist[i] = a;
			System.out.println("Animal added at index " + i);
			i++;
		}else if(i >= thelist.length){
			System.out.println("List Memory is FULL!");
		}
	}
}
