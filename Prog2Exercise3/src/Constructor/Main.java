package Constructor;

public class Main {

	public static void main(String[] args) {
			
		WaterPurifier coway = new WaterPurifier();
		
		System.out.println("\n===============COWAY================");
		System.out.println("Brand\t\t\t: " + coway.brand
							+"\nModel\t\t\t: " + coway.model
							+"\nNumber of function\t: " + coway.function
							+"\nChild safety lock\t: " + coway.childlock
							+"\nHot water\t\t: " + coway.hotwater
							+"\nAmbient water\t\t: " + coway.ambientwater
							+"\nCold water\t\t: " + coway.coldwater
							+"\nRetail price\t\t: RM" + coway.retailprice
							+"\nPrice of monthly rental\t: RM" + coway.monthlyrental + " per month for 5 years");
		
		WaterPurifier lg = new WaterPurifier("LG","WD512AN", 3, 'Y', 'Y', 'Y', 'Y', 5000, 120);
		System.out.println("\n================LG==================");
		System.out.println("Brand\t\t\t: " + lg.brand
				+"\nModel\t\t\t: " + lg.model
				+"\nNumber of function\t: " + lg.function
				+"\nChild safety lock\t: " + lg.childlock
				+"\nHot water\t\t: " + lg.hotwater
				+"\nAmbient water\t\t: " + lg.ambientwater
				+"\nCold water\t\t: " + lg.coldwater
				+"\nRetail price\t\t: RM" + lg.retailprice
				+"\nPrice of monthly rental\t: RM" + lg.monthlyrental + " per month for 5 years");
		
		WaterPurifier cuckoo = new WaterPurifier("Cuckoo","VIVID", 3, 'Y', 'Y', 'Y', 'Y', 3200, 85);
		System.out.println("\n================LG==================");
		System.out.println("Brand\t\t\t: " + cuckoo.brand
				+"\nModel\t\t\t: " + cuckoo.model
				+"\nNumber of function\t: " + cuckoo.function
				+"\nChild safety lock\t: " + cuckoo.childlock
				+"\nHot water\t\t: " + cuckoo.hotwater
				+"\nAmbient water\t\t: " + cuckoo.ambientwater
				+"\nCold water\t\t: " + cuckoo.coldwater
				+"\nRetail price\t\t: RM" + cuckoo.retailprice
				+"\nPrice of monthly rental\t: RM" + cuckoo.monthlyrental + " per month for 5 years");
	}

}
