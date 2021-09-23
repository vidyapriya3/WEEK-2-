
public class TestStringTrimmers {
	public static void main(String []args) {
		StringTrimmersFactory factory=new StringTrimmersFactory();
		StringTrimmers gas=factory.trimmers("Gas");
		if(gas!=null) 
			gas.getStringTrimmers();
		StringTrimmers electric=factory.trimmers("Electric");
		if(electric!=null)
			electric.getStringTrimmers();
		
		StringTrimmers solar=factory.trimmers("Solar");
		if(solar!=null)
			solar.getStringTrimmers();
	}

}
