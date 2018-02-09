
public class Manager {
	public static Playable getPlayer(int option) {
		if(option == 1){
			return new Person();
		}
		else{
			return new Dog();
		}
	}
}
