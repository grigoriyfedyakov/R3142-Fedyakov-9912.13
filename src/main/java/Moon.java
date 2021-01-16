public class Moon {
	private String name;
	public Moon(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public String print(Predlog predlog) {
		switch (predlog) {
			case NA:
				return (" на Луне ");
			case INSIDE:
				return (" внутрь Луны ");
			case PO:
				return (" по Луне ");
		}
		return null;
	}
	public String cover(Predlog predlog) {
		switch (predlog) {
			case NA:
				return ("на лунной поверхности ");
			case INSIDE:
				return("внутрь лунной поверхности ");
			case PO:
				return("по лунной поверхности ");
		}
		return null;
	}
	class Landscape {
		String name1;
		Landscape(String name) { this.name1=name; }
		public String getName1() { return name1; }
	}
	Landscape landscape = new Landscape("лунный пейзаж");
}