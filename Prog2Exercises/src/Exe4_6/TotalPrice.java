package Exe4_6;

class AppleTotalPrice implements Price{

	double ap = 3.00; //ap = apple price for more than 10 but less than 50
	double ap2 = 2.50; //ap2 = apple price for more than 50
	public double tprice(double qq) { //same method as in price
		return ap*qq; //with body
	}
	
	public double tprice(double qq, double dd) { //same method as in price
		return (ap2*qq)*(1-dd); //with body
	}
}

class BananaTotalPrice implements Price{

	double bp = 3.70; //bp = banana price for more than 10 but less than 50
	double bp2 = 3.20; //bp2 = banana price for more than 50
	public double tprice(double qq) { //same method as in price
		return bp*qq; //with body
	}
	
	public double tprice(double qq, double dd) { //same method as in price
		return (bp2*qq)*(1-dd); //with body
	}
}

class WatermelonTotalPrice implements Price{

	double wp = 12.10; //wp = watermelon price for more than 10 but less than 50
	double wp2 = 11.60; //wp2 = watermelon price for more than 50
	public double tprice(double qq) { //same method as in price
		return wp*qq; //with body
	}
	
	public double tprice(double qq, double dd) { //same method as in price
		return (wp2*qq)*(1-dd); //with body
	}
}
