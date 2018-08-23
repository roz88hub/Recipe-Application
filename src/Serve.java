
public class Serve {

	public static void main(String[] args) {
		
		String[] desIngred1 ={"Flour","Water","Cheese","Brown Sugar"};
		String[] desIngred2 ={"Flour","Water","Sugar"};
		
		String[] startIngred1 = {"Flour", "Water","Salt","Potato"};
		String[] startIngred2 = {"Wheat", "Water","Salt","Oil"};
		
		Dessert cake = new Dessert (desIngred1,22.00,"Cheese Cake");
		System.out.println(cake.dishName);
		
		Starter aloChop = new Starter (startIngred1,5.00,"AlooChop");
		System.out.println(aloChop.prepTime);
	}	 
}
