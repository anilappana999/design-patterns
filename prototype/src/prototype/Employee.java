package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee  implements Cloneable{

	private List<String> list;

	public Employee() {
		list = new ArrayList<>();
	}

	public Employee(List<String> list) {
		super();
		this.list = list;
	}
	public void addData() {
		list.add("anil");
		list.add("satya");
	}

	public List<String> getList(){
		return list;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<>();
		tempList.addAll(list);
		return  new Employee(tempList);
	}
	
	
	
}
