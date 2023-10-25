package programming_class;
enum Days {
	low,medium,high
	

}
class Mainclass{
	
	Days d1;

	public Mainclass(Days d1) {
		super();
		this.d1 = d1;
	}
	
	public void display() {
		
		switch (d1) {
		case low:
			System.out.println("LOWER");
			break;
		case medium:
			System.out.println("MEDIUM");
			break;
		case high:
			System.out.println("HIGH");
		break;
		default:
		     System.out.println("INVALIDE DATA");
		}
	}
	
	
}
 class Enum{
	public static void main(String[] args) {
		
		for(Days d1 : Days.values()) {
			System.out.println(d1.ordinal()+"-->"+d1);
		}
	
		
	}
	
}