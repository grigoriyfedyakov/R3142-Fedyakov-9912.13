public abstract class Stone {
	public static class Granit {
		private String name;
		public Granit(String name) { this.name = name; }
		public String getName() { return name; }
	}
	public static class OtherStone {
		private String name;
		public OtherStone(String name) { this.name = name; }
		public String getName() { return name; }
	}
	public static class Loonit {
		private String name;
		public Loonit(String name) { this.name = name; }
		public String getName() { return name; }
		public void definition(String def){ System.out.println(name+": "+def); }
	}
	public static class Antiloonit {
		private String name;
		public Antiloonit(String name) { this.name = name; }
		public String getName() { return name; }
		public String opposite(String who) { return(name+" обладает свойствами, обратными "+who);}
		public void definition(String def){ System.out.println(name+": "+def); }
	}
}
