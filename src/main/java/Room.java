public class Room {
	private String name;
	private Mest mest;
	public Room(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public void appear() {
		switch (mest) {
			case ON:
				System.out.println("Появлялся "+name);
				break;
			case ONA:
				System.out.println("Появлялась "+name);
				break;
			case ONO:
				System.out.println("Появлялось "+name);
				break;
			case ONI:
				System.out.println("Появлялись "+name);
				break;
		}
	}
	public void conect(String str){ System.out.print(name+" для связи с "+str); }
}