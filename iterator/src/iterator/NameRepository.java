package iterator;

import java.util.ArrayList;
import java.util.List;

public class NameRepository implements Container {

	List<String> names = new ArrayList<String>();

	@Override
	public Iterator getIterator() {
		names.add("demo");
		names.add("anil");
		return new NameIterator();

	}

	private class NameIterator implements Iterator {

		int index;

		@Override
		public boolean hasNext() {

			if (index < names.size()) {
				return true;
			}
			return false;
		}

		@Override
		public Object next() {

			if (this.hasNext()) {
				return names.get(index++);
			}
			return null;
		}
	}
}