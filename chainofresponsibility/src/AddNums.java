
public class AddNums implements Chain {

	private Chain nextChain;
	@Override
	public void setChain(Chain chain) {
		nextChain = chain;
		
	}

	@Override
	public void caluclate(Number req) {
		if(req.getOperationPerformed()=="add") {
			System.out.println("addiition op performed");
		System.out.println(req.getNum1()+req.getNum2());
		}
else {
			
	nextChain.caluclate(req);
		}
		
	}

}
