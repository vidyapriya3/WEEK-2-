
public class StringTrimmersFactory {
	public StringTrimmers trimmers(String name) {
		StringTrimmers stringTrimmers=null;
		if(name.equalsIgnoreCase("Gas")) {
			stringTrimmers =new GasPowered();
		}else if(name.equalsIgnoreCase("Electric")) {
			stringTrimmers=new Electric();
		}else {
			System.out.println(name+" powered are not yet released in the market");
		}
		return stringTrimmers;
		
	}

}
