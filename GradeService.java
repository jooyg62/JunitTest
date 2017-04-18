public class GradeService {

	// 중간점수, 기말점수, 과제점수
	int mid, fin, hw;

	public String output() {
		int total = mid + fin + hw;

		if (total >= 80)
			return "A";
		else if (total >= 70 && total < 80)
			return "B";
		else if (total >= 60 && total < 70)
			return "C";
		else
			return "F";

	}

	public void inputMid(int mid) throws InvalidScopeException {
		if(mid>=0 && mid <=35) this.mid = mid;
		else throw new InvalidScopeException();

	}

	public void inputFin(int fin) throws InvalidScopeException {
		if(fin>=0 && fin <=35) this.fin = fin;
		else throw new InvalidScopeException();

	}

	public void inputHw(int hw) throws InvalidScopeException {
		if(hw>=0 && hw <=35) this.hw = hw;
		else throw new InvalidScopeException();

	}

	public void inputMid(double d) throws InvalidArgumentException {
		throw new InvalidArgumentException();

	}

	public void inputFin(double d) throws InvalidArgumentException {
		throw new InvalidArgumentException();

	}

	public void inputHw(double d) throws InvalidArgumentException {
		throw new InvalidArgumentException();

	}

}
