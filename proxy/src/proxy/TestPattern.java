package proxy;

public class TestPattern {

	public static void main(String[] args) {
		

		Internet in = new ProxyInternet();
		
		try {
			
			in.connectTo("google.com");
		}
		catch (Exception e) {
		System.out.println(e);
		}
	}

}
