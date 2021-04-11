package prototype;

import java.util.List;

public class DemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e = new Employee();
e.addData();
System.out.println(e.getList());

List<String> list = e.getList();
list.add("venkat");
list.remove(0);
System.out.println(list);

		
	}

}
