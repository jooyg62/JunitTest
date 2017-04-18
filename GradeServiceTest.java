import static org.junit.Assert.*;
import org.junit.Test;

public class GradeServiceTest {

	@Test
	public void GradeOutputTest() throws InvalidScopeException{
		GradeService gs = new GradeService();
		gs.inputMid(30);
		gs.inputFin(35);
		gs.inputHw(25);
		String grade = gs.output();
		assertEquals("A", grade);
	}
	@Test
	public void GradeOutputTest2() throws InvalidScopeException {
		GradeService gs = new GradeService();
		gs.inputMid(30);
		gs.inputFin(10);
		gs.inputHw(25);
		String grade = gs.output();
		assertEquals("C", grade);
	}
	@Test
	public void GradeOutputTest3() throws InvalidScopeException {
		GradeService gs = new GradeService();
		gs.inputMid(20);
		gs.inputFin(20);
		gs.inputHw(30);
		String grade = gs.output();
		assertEquals("B", grade);
	}
	@Test
	public void GradeOutputTest4() throws InvalidScopeException{
		GradeService gs = new GradeService();
		gs.inputMid(20);
		gs.inputFin(20);
		gs.inputHw(15);
		String grade = gs.output();
		assertEquals("F", grade);
	}
	@Test(expected=InvalidArgumentException.class)
	public void InputWithDoubleTypeTest() throws Exception {
			GradeService gs = new GradeService();
			gs.inputMid(20.8);
			gs.inputFin(34.4);
			gs.inputHw(27.5);

	}
	@Test(expected=InvalidScopeException.class)
	public void InputWithOutRangeTest() throws Exception {
			GradeService gs = new GradeService();
			gs.inputMid(40);
			gs.inputFin(40);
			gs.inputHw(40);

	}
}
