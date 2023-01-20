package behavioralPattern.iterator;

/*
	자료 구조와 같이 접근이 잦은 객체에 대해 동일한 인터페이스를 사용하도록 하는 패턴이다.
	SQL이나 통신프로토콜과 같은 것을 개발할 때 사용한다.
*/

public class IteratorPattern {
	
	public static void main(String[] args) {
		
		Item[] items = {
				new Item("A",1000),
				new Item("B",2000),
				new Item("C",3000),
				new Item("D",4000),
		};
		
		Array array = new Array(items);
		Iterator it = array.iterator();
		
		while(it.next()) {
			System.out.println(it.current().toString());
		}
		
	}

}