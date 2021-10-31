

public class SubNumbers implements Chain{

	private Chain nextChain;
	@Override
	public void setChain(Chain chain) {
		nextChain = chain;
		
	}

	@Override
	public void caluclate(Number req) {
		if(req.getOperationPerformed()=="sub") {
			System.out.println("sub op performed");
		System.out.println(req.getNum1()-req.getNum2());
		}
else {
			
	nextChain.caluclate(req);
		}
		
	}
}
