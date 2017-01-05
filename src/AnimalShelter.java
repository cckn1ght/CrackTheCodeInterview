import java.util.LinkedList;

abstract class Animal {
	private int order;
	protected String name;
	public Animal(String n) {name = n;}
	public void setOrder(int ord) {order = ord;}
	public int getOrder() {return order;}
	public boolean isOlder(Animal a) {
		return this.order < a.getOrder();
	}
}
class Dog extends Animal {
	public Dog(String n) {
		super(n);
	}
}
class Cat extends Animal {
	public Cat(String n) {
		super(n);
	}
}
public class AnimalShelter {
	private LinkedList<Dog> dogs = new LinkedList<Dog>();
	private LinkedList<Cat> cats = new LinkedList<Cat>();
	private int order;
	public AnimalShelter() {
		order = 0;
	}
	public void enqueue(Animal a) {
		a.setOrder(order);
		order++;
		
		if(a instanceof Dog) dogs.addLast((Dog) a);
		else if (a instanceof Cat) cats.addLast((Cat) a);
	}
	public Animal dequeue() {
		if (dogs.isEmpty()) return dequeueCats();
		else if (cats.isEmpty()) return dequeueDogs();
		Dog dog = dogs.peek();
		Cat cat = cats.peek();
		if (dog.isOlder(cat)) return dequeueDogs();
		else return dequeueCats();
	}
	public Dog dequeueDogs() {
		return dogs.poll();
	}
	public Cat dequeueCats() {
		return cats.poll();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
