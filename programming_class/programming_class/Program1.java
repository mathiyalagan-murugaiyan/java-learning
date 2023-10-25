//Using methode call
package programming_class;

class DistanceConverter{

	static void converter(int x){
		
	float km,m,cm,i,ft;	
		km =  x;
		m = km*1000;
		cm = m*100;
		ft = cm/2.54f;
		i = ft/12f;
		
		System.out.println("KM :" + km);
		System.out.println("M :" + m);
		System.out.println("CM :" + cm);
		System.out.println("FT :" + ft);
		System.out.println("I :" + i);
	 
	 return;
	}
	
	public static void main(String args[]){
		
		converter(45); //methode call
		
	}
}