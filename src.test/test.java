import org.junit.BeforeClass;
import org.junit.Test;

import DuckBehaviorImpl.FlyNoWay;
import DuckBehaviorImpl.FlyWithRockets;
import DuckBehaviorImpl.FlyWithWings;
import DuckBehaviorImpl.MuteQuack;
import DuckBehaviorImpl.Quack;
import DuckBehaviorImpl.Squeak;
import DuckType.MallardDuck;
import DuckType.RedheadDuck;
import DuckType.RubberDuck;

public class test {

@BeforeClass
public static void setUpBeforeClass() throws Exception {
}

@Test
public void test() {
	Quack quack=new Quack();
	Squeak squack=new Squeak();
	MuteQuack mutequack=new MuteQuack();
	
	FlyWithWings flyWithWings=new FlyWithWings ();
	FlyWithRockets flyWithRocket=new FlyWithRockets ();
	FlyNoWay flyNoWay=new FlyNoWay ();
	
	MallardDuck mallardduck=new MallardDuck(quack,flyWithWings);
	RedheadDuck redheadduck=new RedheadDuck(squack,flyWithRocket);
	RubberDuck rubberduck=new RubberDuck(mutequack,flyNoWay);
	
	mallardduck.display();
	redheadduck.display();
	rubberduck.display();
	
}
}