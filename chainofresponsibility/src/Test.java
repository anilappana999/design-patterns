

public class Test {

	public static void main(String[] args) {
		Number num= new Number(10, 2, "sub");
		Chain addi = new AddNums();
		Chain sub = new SubNumbers();
		Chain mul = new MulNumbers();
		addi.setChain(sub);
		sub.setChain(mul);
		addi.caluclate(num);
		
	}

}
