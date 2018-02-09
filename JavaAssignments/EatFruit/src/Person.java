
public class Person {
	public void eatFruit(int fruit){
		if(fruit == 1){
			System.out.println("Eating Apple");
		}
		else if(fruit == 2){
			System.out.println("Eating Banana");
		}
		else{
				System.out.println("Don't know what fruit");
		}
	}
	
	public void eatFruit(enumtest.Fruit fruit){
		System.out.println("Eating" + fruit);
	}
}	
