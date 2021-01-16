public class Cave  {
	private String name;
	public Cave(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void fill(String how) {
		if (how=="AFTER") {
			System.out.print(" после чего "+getName()+" заполнялась воздухом");
		}
		if (how=="BEFORE") {
			System.out.print(" перед чем "+getName()+" заполнялась воздухом");
		}
	}
	public void reform(String where) {
		System.out.print(" оборудования под жилье "+name+where);
	}
	public void nearby(String where) {
		System.out.print("Рядом с " +name+" "+where);
	}
}