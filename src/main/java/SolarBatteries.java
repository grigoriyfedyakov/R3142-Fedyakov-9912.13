public class SolarBatteries extends Innovations {
	private String name;
	private Mest mest;
	public SolarBatteries(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void place() {
		switch(mest) {
			case ON:
				System.out.print("устанавливался " +getName());
				break;
			case ONA:
				System.out.print("устанавливлась "+getName());
				break;
			case ONI:
				System.out.print("устанавливались "+getName());
				break;
			case ONO:
				System.out.print("устанавливалось "+getName());
				break;
		}
	}
	public void produce(String str) {
		switch(mest) {
			case ON:
				System.out.print(" вырабатывающий "+str);
				break;
			case ONA:
				System.out.print(" вырабатывающая "+str);
				break;
			case ONI:
				System.out.print(" вырабатывающие "+str);
				break;
			case ONO:
				System.out.print(" вырабатывающее "+str);
				break;
		}
	}
}