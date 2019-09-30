package app;

//import static org.junit.Assert.assertEquals;

public class CalcTest {
	public boolean testadd() {
		return Calc.add(1,2)==3;
	}
	public boolean testsubtract() {
		return Calc.subsract(2,1)==1;
	}
}
