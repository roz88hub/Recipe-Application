//command line arguments
//wrapper classes
public abstract class Recipe<ingredients> {
	
	protected String[] ingredients;
	protected double prepTime;
	protected String dishName;
	
	
	
	/*ingredients[] = new ingredients[5];
	ingredients[0] = new ingredients{"flour" };*/
	
	//ingredients[] = new ingredients{new("hello")};
	
	public Recipe(String[] ingredients, double prepTime, String dishName){
		this.ingredients = ingredients;
		this.prepTime = prepTime;
		this.dishName = dishName;
	}

	Recipe(double prepTime){
		this.prepTime = prepTime;
	}
	
	Recipe(String dishName){
		this.dishName = dishName;
	}
	
	
	
	public abstract void prepare();
	
	public abstract void taste();
	
	public void cleanUp(){
		System.out.println("Dish");
	}
	

}
