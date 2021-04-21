package Exe3_1;

public class Main {

	public static void main(String[] args) {
		
		WaterPurifier coway = new WaterPurifier();
		
		System.out.println("\n===============COWAY================");
		System.out.println("Brand\t\t\t\t: " + coway.getBrand()
				+"\nModel\t\t\t\t: " + coway.getModel()
				+"\nNumber of function\t\t: " + coway.getFunction()
				+"\nChild safety lock\t\t: " + coway.getChildLock()
				+"\nHot water\t\t\t: " + coway.getHotWater()
				+"\nAmbient water\t\t\t: " + coway.getAmbientWater()
				+"\nCold water\t\t\t: " + coway.getColdWater()
				+"\nRetail price\t\t\t: RM" + coway.getRetailPrice()
				+"\nPrice of monthly rental\t\t: RM" + coway.getMonthlyRental() + " per month for 5 years"
				+"\nTotal rental price for 1 year\t: RM" + coway.calAnnualRental());
		
		WaterPurifier lg = new WaterPurifier("LG","WD512AN", 3, 'Y', 'Y', 'Y', 'Y', 5000, 120);
		System.out.println("\n================LG==================");
		System.out.println("Brand\t\t\t\t: " + lg.getBrand()
				+"\nModel\t\t\t\t: " + lg.getModel()
				+"\nNumber of function\t\t: " + lg.getFunction()
				+"\nChild safety lock\t\t: " + lg.getChildLock()
				+"\nHot water\t\t\t: " + lg.getHotWater()
				+"\nAmbient water\t\t\t: " + lg.getAmbientWater()
				+"\nCold water\t\t\t: " + lg.getColdWater()
				+"\nRetail price\t\t\t: RM" + lg.getRetailPrice()
				+"\nPrice of monthly rental\t\t: RM" + lg.getMonthlyRental() + " per month for 5 years"
				+"\nTotal rental price for 1 year\t: RM" + lg.calAnnualRental());
		
		WaterPurifier cuckoo = new WaterPurifier("Cuckoo","VIVID", 3, 'Y', 'Y', 'Y', 'Y', 3200, 85);
		System.out.println("\n================CUCKOO==================");
		System.out.println("Brand\t\t\t\t: " + cuckoo.getBrand()
				+"\nModel\t\t\t\t: " + cuckoo.getModel()
				+"\nNumber of function\t\t: " + cuckoo.getFunction()
				+"\nChild safety lock\t\t: " + cuckoo.getChildLock()
				+"\nHot water\t\t\t: " + cuckoo.getHotWater()
				+"\nAmbient water\t\t\t: " + cuckoo.getAmbientWater()
				+"\nCold water\t\t\t: " + cuckoo.getColdWater()
				+"\nRetail price\t\t\t: RM" + cuckoo.getRetailPrice()
				+"\nPrice of monthly rental\t\t: RM" + cuckoo.getMonthlyRental() + " per month for 5 years"
				+"\nTotal rental price for 1 year\t: RM" + cuckoo.calAnnualRental());
	}

}
