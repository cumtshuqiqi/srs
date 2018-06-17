package DuckType;

import DuckBehavior.FlyBehavior;
import DuckBehavior.QuackBehavior;

public class RedheadDuck extends Duck{
	public RedheadDuck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
		super(quackBehavior, flyBehavior);
		// TODO Auto-generated constructor stub
	}
	
	public void display(){
		System.out.println("I am a redheadDuck!");
		performQuack();
		performFly();
	}
}
