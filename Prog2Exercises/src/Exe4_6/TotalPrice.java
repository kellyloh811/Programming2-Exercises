package Exe4_6;

class TotalPrice implements Price{

	public double tprice(double pp, double qq) {
		return pp*qq;
	}
	
	public double tprice(double pp, double qq, double dd) {
		return (pp*qq)*(1-dd);
	}
}
