package SetterGetter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Oven elba = new Oven();
		Oven panasonic = new Oven();
		Oven khind = new Oven();
		Oven cornell = new Oven();
		
		System.out.println("===============ELBA===============");
		elba.setBrand("Elba");
		elba.setModel("EEO-J4591D(BK)");
		elba.setColour("Black");
		elba.setCapacity(45);
		elba.setPower(2000);
		elba.setWarrantyPeriod(1);
		
		System.out.println("Brand\t\t: " + elba.getBrand());
		System.out.println("Model\t\t: " + elba.getModel());
		System.out.println("Colour\t\t: " + elba.getColour());
		System.out.println("Capacity\t: " + elba.getCapacity() + "L");
		System.out.println("Power\t\t: " + elba.getPower() + "W");
		System.out.println("Warranty Period\t: " + elba.getWarrantyPeriod() + " year(s)\n");
		
		System.out.println("============PANASONIC=============");
		panasonic.setBrand("Panasonic");
		panasonic.setModel("NU-SC100WMPQ");
		panasonic.setColour("White");
		panasonic.setCapacity(15);
		panasonic.setPower(1340);
		panasonic.setWarrantyPeriod(1);
		
		System.out.println("Brand\t\t: " + panasonic.getBrand());
		System.out.println("Model\t\t: " + panasonic.getModel());
		System.out.println("Colour\t\t: " + panasonic.getColour());
		System.out.println("Capacity\t: " + panasonic.getCapacity() + "L");
		System.out.println("Power\t\t: " + panasonic.getPower() + "W");
		System.out.println("Warranty Period\t: " + panasonic.getWarrantyPeriod() + " year(s)\n");
		
		System.out.println("===============KHIND==============");
		khind.setBrand("Khind");
		khind.setModel("OT52R");
		khind.setColour("Red");
		khind.setCapacity(52);
		khind.setPower(2000);
		khind.setWarrantyPeriod(2);
		
		System.out.println("Brand\t\t: " + khind.getBrand());
		System.out.println("Model\t\t: " + khind.getModel());
		System.out.println("Colour\t\t: " + khind.getColour());
		System.out.println("Capacity\t: " + khind.getCapacity() + "L");
		System.out.println("Power\t\t: " + khind.getPower() + "W");
		System.out.println("Warranty Period\t: " + khind.getWarrantyPeriod() + " year(s)\n");
		
		System.out.println("==============CORNELL=============");
		cornell.setBrand("Cornell");
		cornell.setModel("CEO-E36SL");
		cornell.setColour("Black");
		cornell.setCapacity(36);
		cornell.setPower(1500);
		cornell.setWarrantyPeriod(1);
		
		System.out.println("Brand\t\t: " + cornell.getBrand());
		System.out.println("Model\t\t: " + cornell.getModel());
		System.out.println("Colour\t\t: " + cornell.getColour());
		System.out.println("Capacity\t: " + cornell.getCapacity() + "L");
		System.out.println("Power\t\t: " + cornell.getPower() + "W");
		System.out.println("Warranty Period\t: " + cornell.getWarrantyPeriod() + " year(s)\n");
	}

}
