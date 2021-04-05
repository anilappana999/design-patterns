package proxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String serverhost) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(serverhost +"connecting to your site" );
		
	}

}
