import java.util.Objects;

public class Human implements Thinker, Korotishki {
	private String name;
	private Mest mest;
	public Human(String name, Mest mest) {
		this.name = name;
		this.mest = mest;
	}
	public String getName() {
		return name;
	}
	public void setName() throws NoName {
		if (name == "") {
			throw new NoName("Отсутствует имя коротышки.");
		}
	}
	public void startCreate() { System.out.print(getName()+" начал создавать "); }
	public void think(String how) {
		System.out.print(getName()+" ");
		if (how=="FAST") {
			System.out.print("недолго ");
		}
		switch(mest) {
			case ON:
				System.out.print("думал ");
				break;
			case ONA:
				System.out.print("думала ");
				break;
			case ONI:
				System.out.print("думали ");
				break;
			case ONO:
				System.out.print("думал ");
				break;
		}
	}
	public void thinkDeliver(String where,String what) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("принялcя думать, как доставить "+what+" в "+where+" ");
				break;
			case ONA:
				System.out.print("принялась думать, как доставить "+what+" в "+where+" ");
				break;
			case ONI:
				System.out.print("принялись думать, как доставить "+what+" в "+where+" ");
				break;
			case ONO:
				System.out.print("принялось думать, как доставить "+what+" в "+where+" ");
				break;
		}
	}
	public void thinkLaunch(String what, String where) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("принялcя думать, как запустить "+what+" "+where);
				break;
			case ONA:
				System.out.print("принялась думать, как запустить "+what+" "+where);
				break;
			case ONI:
				System.out.print("принялись думать, как запустить "+what+" "+where);
				break;
			case ONO:
				System.out.print("принялось думать, как запустить "+what+" "+where);
				break;
		}
	}
	public void finishedThink(String How,String what) {
		System.out.print(name+" ");
		if (How=="LONG") {
			System.out.print("в результате долгих обдумываний ");
		}
		switch(mest) {
			case ON:
				System.out.print("додумался ");
				break;
			case ONA:
				System.out.print("додумалась ");
				break;
			case ONI:
				System.out.print("додумались ");
				break;
			case ONO:
				System.out.print("додумалось ");
				break;
		}
		System.out.print(what);
	}
	public void notThink(String how, String what) {
		if (how=="ONLY") {
			System.out.print("Единственное, до чего ");
		}
		System.out.print("не смогли додуматься " + name+" это "+what);
	}
	public void say(String what) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("сказал: "+what);
				break;
			case ONA:
				System.out.print("сказала: "+what);
				break;
			case ONI:
				System.out.print("сказали: "+what);
				break;
			case ONO:
				System.out.print("сказало: "+what);
				break;
		}
	}
	public void supper() {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("поужинал ");
				break;
			case ONA:
				System.out.print("поужинала ");
				break;
			case ONI:
				System.out.print("поужинали ");
				break;
			case ONO:
				System.out.print("поужинало ");
				break;
		}
	}
	public void moved(String what) {
		System.out.print(name+" организованно ");
		switch(mest) {
			case ON:
				System.out.print("перешёл в "+what);
				break;
			case ONA:
				System.out.print("перешла в "+what);
				break;
			case ONI:
				System.out.print("перешли в "+what);
				break;
			case ONO:
				System.out.print("перешло в "+what);
				break;
		}

	}
	public void left(String what) {
		System.out.print(name+" ");
		switch(mest) {
			case ON:
				System.out.print("покинул "+what);
				break;
			case ONA:
				System.out.print("покинула "+what);
				break;
			case ONI:
				System.out.print("покинули "+what);
				break;
			case ONO:
				System.out.print("покинуло "+what);
				break;
		}
	}
	public void betterWatchOver(String where1, String where2){
		System.out.print(name+" удобнее было следить за коротышками в "+where1+", чем в "+where2);
	}
	public String watchOver(){ return("ничто не скроется от моего взора"); }
	public String liveOnMoon() { return ("жить на Луне"); }
	public void jump(String where) { System.out.print(name+" прыгал"+where); }
	public void gotTired() { System.out.print(name+" устал"); }
	public void discovered(String what){
		System.out.print(name);
		switch(mest) {
			case ON:
				System.out.print(" открыл ");
				break;
			case ONA:
				System.out.print(" открыла ");
				break;
			case ONI:
				System.out.print(" открыли ");
				break;
			case ONO:
				System.out.print(" открыло ");
				break;
		}
		System.out.print(what);
	}
	public void givein() {
		System.out.print(name);
		switch(mest) {
			case ON:
				System.out.print(" уступил ");
				break;
			case ONA:
				System.out.print(" уступила ");
				break;
			case ONI:
				System.out.print(" уступили ");
				break;
			case ONO:
				System.out.print(" уступило ");
				break;
		}
		System.out.print("ради общего блага ");
	}
	public void meanIt(){ System.out.print(name+" слова на ветер не бросает!"); }
	public void slept(Integer time) throws PilulkinIsAwake{
		if (time > 0) {
			System.out.print(name);
			switch (mest) {
				case ON:
					System.out.print(" лёг ");
					break;
				case ONA:
					System.out.print(" легла ");
					break;
				case ONI:
					System.out.print(" легли ");
					break;
				case ONO:
					System.out.print(" легло ");
					break;
			}
			System.out.print("спать и уснул настолько крепко, что за " + time + " час. сна не проснулся ни разу");
		} else {
			throw new PilulkinIsAwake("Пилюлькин не уснул. Коротышки не занялись своими делами.");
		}
	}
	public void feel(String what){ System.out.print(name+" чувствует, что "+what); }
	public void took(String what){ System.out.print(name+" схватил "+what);}
	public void whistle(String what, String when) {
		if (when == "PAST") {
			System.out.print(name + " начал насвистывать " + what);
		}
		if (when == "PRESENT") {
			System.out.print(name + " то насвистывает " + what);
		}
	}
	public void doSomething() { System.out.print("сделал что-то"); }
	public static class Paper{
		private String namePaper;
		public Paper(String namepaper) {this.namePaper=namepaper;}
		public String getNamePaper() { return namePaper; }
	}
	public void writeSymphony(String when){
		if (when == "PAST"){ System.out.print(name+" стал писать Космическую симфонию");}
		if (when == "PRESENT"){ System.out.print(", то пишет Космическую симфонию");}
	}
	public void play(String what){ System.out.print(name+" сыграл на "+what);}
    public void hurt(String who) { System.out.print(who + " отхватил бы люлей от " + name + ", если бы тот не спал"); }
	public String draw(String what) { return ("рисовать "+what);}
	public void want(String what) { System.out.print(name+" давно хотел "+what);}
	public String takeOffSuit() {
		class SpaceSuit {
			public String name1;
			public SpaceSuit(){
				this.name1="скафандр";
			}
			public String getName1() { return name1; }
		}
		SpaceSuit suit = new SpaceSuit();
		return ("снять "+suit.getName1());
	}
}