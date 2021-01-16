public class RocketPart {
	private String name;
	public RocketPart(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String attach(String where) {
		return ("приделать "+name+" к "+where);
	}
	public String whereTake(String where) {
		return ("где взять "+name+where);
	}
}