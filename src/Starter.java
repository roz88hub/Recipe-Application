
public class Starter extends Recipe {
	
	String[] ingredients;
	double prepTime;
	String dishName;
	public Starter(String[] ingredients, double prepTime, String dishName) {
		super(ingredients, prepTime, dishName);
		this.ingredients = ingredients;
		this.prepTime = prepTime;
		this.dishName = dishName;
	} 
	@Override
	public void prepare() {
		System.out.println("Initial");
		
	}
	@Override
	public void taste() {
		System.out.println("Spicy");
		
	}
	

}
