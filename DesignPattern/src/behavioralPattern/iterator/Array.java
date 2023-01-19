package behavioralPattern.iterator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Array implements Aggregator {
	
	private Item[] items;
	
	public Item getItem(int index) {
		return items[index];
	}
	
	public int getCount() {
		return items.length;
	}

	@Override
	public Iterator iterator() {
		return new ArrayIterator(this);
	}

}