package exercises;

public class Smurf {

	private String name;
	private static Smurf papaSmurf = null;

	public static Smurf createSmurf(String name) {
		if(name == "papa"){
			if(papaSmurf == null){
				papaSmurf = new Smurf(name);
				System.out.println("Creating " + name + " Smurf");
				return papaSmurf;
			}
			else{
				System.out.println("Only one papa allowed");
				return null;
			}
		}
		else{	
			System.out.println("Creating " + name +  " Smurf");
			return new Smurf(name);
		}
	}

	private Smurf(String name) {
		this.name = name;
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

}
