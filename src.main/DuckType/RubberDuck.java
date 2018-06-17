package DuckType;

import DuckBehavior.FlyBehavior;
import DuckBehavior.QuackBehavior;

public class RubberDuck extends Duck{
	public RubberDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		System.out.println("I am a redheadDuck!");
		performQuack();
		performFly();
	}

}
