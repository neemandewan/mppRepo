package assignment07.prob5;

public class Main {
	
	public static void main(String[] args) {
		Duck[] ducks = {new MallarDuck(), new DecoyDuck(), new RedHeadDuck(), new RubberDuck()};
		for(Duck d: ducks) {
			System.out.println(d.getClass().getSimpleName() + ":");
			d.display();
			d.fly();
			d.quack();
			d.swim();
		}
	}
}

/*

	MallarDuck:
	display
	fly with wings
	quacking
	swimming
	DecoyDuck:
	displaying
	cannot fly
	cannot quack
	swimming
	RedHeadDuck:
	displaying
	fly with wings
	quacking
	swimming
	RubberDuck:
	displaying
	cannot fly
	squeaking
	swimming

*/
