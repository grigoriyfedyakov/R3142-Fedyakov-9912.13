public class Door extends Innovations {
	private String name;
	private Mest mest;
	public Door(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void place() {
		switch(mest) {
			case ON:
				System.out.print("делался " +getName());
				break;
			case ONA:
				System.out.print("делалась "+getName());
				break;
			case ONI:
				System.out.print("устанавливались "+getName());
				break;
			case ONO:
				System.out.print("делалось "+getName());
				break;
		}
	}
	public void produce(String str) {
		switch(mest) {
			case ON:
				System.out.print(" вырабатывающий ");
				break;
			case ONA:
				System.out.print(" вырабатывающая ");
				break;
			case ONI:
				System.out.print(" вырабатывающие ");
				break;
			case ONO:
				System.out.print(" вырабатывающее ");
				break;
		}
	}
}