
public class Dessert extends Recipe {
	
	String[] ingredients;
	double prepTime;
	String dishName;
	String creamColor;
	String[] creamColors;
	int marshmallow;
	int choclateChip;
	
	public Dessert(String[] ingredients, double prepTime, String dishName) {
		super(ingredients, prepTime, dishName);
		this.ingredients = ingredients;
		this.prepTime = prepTime;
		this.dishName = dishName;
	}
	/*public Dessert(String creamColor, int marshmallow) {
		this.creamColor = creamColor;
		this.marshmallow = marshmallow;
		
	}
	public Dessert(String[] creamColors) {
		this.creamColor = creamColor;
		this.marshmallow = marshmallow;
	}*/

	public class ingredients {
		String name;
	
	public  void batter(){
		System.out.println("Battering");
	}
	public void bake(){
		System.out.println("baking");
	}
	public void decorate(){
		System.out.println("decorating");
	}
	
	
	public void decorate(String creamColor){
		
	}
	
	public int decorate(String creamColor, int marshmallow){
		return marshmallow;
	}
	
	public String decorate(String[] creamColors){
		return ("decorating with colors") ;
	}
	
	public void decorate(int choclateChip){
		System.out.println("Return anything");
	}
	
	
}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void taste() {
		// TODO Auto-generated method stub
		
	}
}
