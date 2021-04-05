package proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	Internet internet = new RealInternet();
	@Override
	public void connectTo(String serverhost) throws Exception {
		List<String> list = new ArrayList<>();
		list.add("abc.com");
		list.add("fb.com");
		
		if(list.contains(serverhost)) {
			throw new Exception("access not granted");
		}
		
		internet.connectTo(serverhost);
	}

}
