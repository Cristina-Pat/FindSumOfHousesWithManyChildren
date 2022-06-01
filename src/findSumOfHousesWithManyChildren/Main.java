package findSumOfHousesWithManyChildren;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		
	Test t = new Test();
	t.children.put(1, new HashSet<String>());
	t.children.put(2, new HashSet<String>());
	t.children.put(3, new HashSet<String>());
	t.children.put(4, new HashSet<String>());

	t.children.get(1).add("Joe");
	t.children.get(1).add("Bill");
	t.children.get(1).add("Frank");
	t.children.get(1).add("Arthur");
	t.children.get(2).add("Havel");
	t.children.get(2).add("Elisabet");
	t.children.get(2).add("Josef");
	t.children.get(3).add("Mustafa");

	t.moreThan3Children();
	
	Test t2 = new Test();
	t2.children.put(1, new HashSet<String>());
	t2.children.put(2, new HashSet<String>());
	t2.children.put(3, new HashSet<String>());
	t2.children.put(4, new HashSet<String>());

	t2.children.get(1).add("Frank");
	t2.children.get(1).add("Arthur");
	t2.children.get(2).add("Havel");
	t2.children.get(2).add("Elisabet");
	t2.children.get(3).add("Mustafa");

	t2.moreThan3Children2();
	t2.getKey();
	}
}
