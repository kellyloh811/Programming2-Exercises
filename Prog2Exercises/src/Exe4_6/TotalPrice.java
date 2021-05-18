package Exe4_6;

class TotalPrice implements Price{

	public double tprice(double pp, double qq) { //same method as in price
		return pp*qq; //with body
	}
	
	public double tprice(double pp, double qq, double dd) { //same method as in price
		return (pp*qq)*(1-dd); //with body
	}
}
