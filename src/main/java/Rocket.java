public class Rocket implements Rider {
	private String name;
	private Mest mest;
	public Rocket(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void freeRide(String where) {
		switch(mest) {
			case ON:
				System.out.print("он" + " мог свободно кататься ");
				break;
			case ONA:
				System.out.print("она" + " могла свободно кататься ");
				break;
			case ONI:
				System.out.print("они" + " могли свободно кататься ");
				break;
			case ONO:
				System.out.print("оно" + " могло свободно кататься ");
				break;
		}
		System.out.print(where);
	}
	class Caiuta {
		public String name1;
		public Caiuta(){
			this.name1=" каюта";
		}
		public String only() {
			return(name1+" для каждого отдельно");
		}
		public String forall() {
			return(name1+" одна на всех ");
		}
	}
	Caiuta caiuta = new Caiuta();
	public String better(String who) {
		return (name+" лучше "+who+", потому что в "+name+caiuta.only()+", a в "+who+caiuta.forall() );
	}
}