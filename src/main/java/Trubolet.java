public class Trubolet implements Rider {
	private String name;
	public Trubolet(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void like() { System.out.print("как "+getName()); }
	public void freeRide(String where) { System.out.print("кататься "+where); }
}