package codedefenders;

/* Introducing the new Jura IMPRESSA XJ9 Professional
 * 
 * 3.5 inch TFT color display & 135 oz water tank.
 * One-Touch Cappuccino/Latte macchiato function allows you
 * to prepare specialty coffees topped with milk & milk foam
 * at simply the touch of a button.
 * 
 * Chrome-plated bean container & brilliant silver finish.
 */

public class CoffeeMachine {
	
	int coffeeBeans = 250; // g
	int milkAmount = 500;        // ml
	int waterAmount = 2000;      // ml
	
	int beanContainerCapacity = 500;
	int waterTankCapacity = 4000;
	
	public int getCoffeeBeansAmount() {
		return coffeeBeans;
	}
	
	public void addCoffeeBeans(int amount) {
		if (amount + getCoffeeBeansAmount() > beanContainerCapacity) {
			throw new IllegalArgumentException("Amount exceeds the capacity!");
		}
		coffeeBeans += amount;
	}
	
	public int getMilkAmount() {
		return milkAmount;
	}
	
	public void addMilk(int amount) {
		milkAmount += amount;
	}
	
	public int getWaterAmount() {
		return waterAmount;
	}
	
	public void addWater(int amount) {
		if (amount + getWaterAmount() > waterTankCapacity) {
			throw new IllegalArgumentException("Amount exceeds the capacity!");
		}
		waterAmount += amount;
	}
	
	public boolean isTrayFull() {
		// returns true, if machine's drip tray needs to be emptied
		if (getCoffeeBeansAmount() <= 10 && getWaterAmount() < 100) {
			return true;
		}
		return false;
	}
	
	public void makeEspresso(int coffee, int water) {
		if (getCoffeeBeansAmount() >= 18 && getWaterAmount() >= 35) { //mutante 18 em vez de 30
			if (!isTrayFull()) {
				if (coffee < 18 || coffee > 25) {
					throw new IllegalArgumentException("This just isn't the right amount of coffee!");
				}
				else if (water < 30 || water > 40) {
					throw new IllegalArgumentException("This just isn't the right amount of water!");
				}
				coffeeBeans -= coffee;
				waterAmount -= water;
				System.out.println("Here you go! Enjoy your espresso!");
			}
		}
		else {
			throw new IllegalArgumentException("Check the amount of coffee beans and/or water!");
		}
	}
	
	public void makeLatte(int coffee, int water, int milk) {
		if (getMilkAmount() < 135) {
			makeEspresso(coffee, water);
		}
		else if (milk <= 135 || milk >= 145) {
			throw new IllegalArgumentException("This just isn't the right amount of milk!");
		}
		coffeeBeans -= coffee;
		waterAmount -= water;
		milkAmount -= milk;
		System.out.println("Here you go! Enjoy you latte!");
	}
	
	// let's try out new machine!
	
	public static void main(String[] args) {
		CoffeeMachine machine = new CoffeeMachine();
		
		//System.out.println("beans: " + machine.getCoffeeBeansAmount());
		//machine.makeEspresso(18, 30);
		//System.out.println("beans: " + machine.getCoffeeBeansAmount());
		//System.out.println("water: " + machine.getWaterAmount());
		machine.milkAmount = 100;
		machine.makeLatte(1, 1, 1);
		//System.out.println("beans: " + machine.getCoffeeBeansAmount());
		//System.out.println("water: " + machine.getWaterAmount());
		//System.out.println("milk: " + machine.getMilkAmount());
		//machine.addMilk(100);
		//System.out.println("milk: " + machine.getMilkAmount());
		//This just isn't the right amount of coffee!
		
	}
}
