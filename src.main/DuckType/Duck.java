package DuckType;

import DuckBehavior.FlyBehavior;
import DuckBehavior.QuackBehavior;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	public Duck(QuackBehavior quackBehavior,FlyBehavior flyBehavior) {
		this.quackBehavior=quackBehavior;
		this.flyBehavior=flyBehavior;
	}
	 public  void swim() {
		   System.out.println("����Ӿ");;
	   }
	   public  void display() {
		   System.out.println("������");
	   }
	public void performQuack() {
	      quackBehavior.quack();
	   }
	   public void performFly() {
		   flyBehavior.fly();	   
	}
	   public void setQuackBehavior(QuackBehavior behavior) {
		      this.quackBehavior = behavior;
		   }
	   public void setFlyBehavior(FlyBehavior behavior) {
			  this.flyBehavior = behavior;
		   }
	  
		   
		}

	   

	
	

