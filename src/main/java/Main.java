public class Main {
	public static void main(String[] args) throws NoName {
		Human starmen = new Human("Космонавты",Mest.ONI);
		Human kubik = new Human("", Mest.ON);
		try { kubik.checkName();} catch (NoName noName) { System.err.println("ERROR! "+noName.getMessage()); }
		Human vintikandshpuntik = new Human("Винтик и Шпунтик", Mest.ONI);
		try { vintikandshpuntik.checkName();} catch (NoName noName) { System.out.println("ERROR! "+noName.getMessage()); }
		Human pilulkin = new Human("Пилюлькин",Mest.ON);
		try { pilulkin.checkName();} catch (NoName noName) { System.out.println("ERROR! "+noName.getMessage()); }
		Human guslya = new Human("Гусля",Mest.ON);
		try { guslya.checkName();} catch (NoName noName) { System.out.println("ERROR! "+noName.getMessage()); }
		Human tubik = new Human("Тюбик",Mest.ON);
		try { tubik.checkName();} catch (NoName noName) { System.out.println("ERROR! "+noName.getMessage()); }
		Human znaykazvezdochkin = new Human("Знайка и профессор Звездочкин",Mest.ONI);
		try { znaykazvezdochkin.checkName();} catch (NoName noName) { System.out.println("ERROR! "+noName.getMessage()); }
		Human klyopka = new Human("Инженер Клепка",Mest.ON);
		try { klyopka.checkName();} catch (NoName noName) { System.out.println("ERROR! "+noName.getMessage()); }
		Moon moon = new Moon("Луна");
		Cave cave = new Cave("пещера");
		Cave othercave = new Cave("другая пещера");
		Entrance entrance = new Entrance("вход в пещеру");
		WallsFloor wallsfloor = new WallsFloor("Стены и потолок пещеры");
		Inners inners = new Inners("Внутренность пещеры");
		Rocket rocket = new Rocket("ракета", Mest.ONA);
		RocketPart wheels = new RocketPart("колеса");
		RocketPart tale = new RocketPart("хвост");
		Trubolet trubolet = new Trubolet("реактивный роликовый труболет");
		Wall wall = new Wall("воздухонепроницаемая стенка", Mest.ONA);
		Door door = new Door("герметически закрывающаяся дверь", Mest.ONA);
		Sluice sluice = new Sluice("шлюзовое устройство", Mest.ONO);
		SolarBatteries solarbatteries = new SolarBatteries("солнечные батареи", Mest.ONI);
		Physical.Electricity electricity = new Physical.Electricity("электроэнергия");
		Room rooms = new Room("комнаты",Mest.ONI);
		Room corridors = new Room("коридоры", Mest.ONI);
		Room halls = new Room("залы", Mest.ONI);
		Room downs = new Room("подвалы", Mest.ONI);
		Room elevators = new Room("лифты", Mest.ONI);
		Room callbox = new Room("телефонные будки", Mest.ONI);
		Room hutch = new Room("закрома", Mest.ONI);
		Room storage = new Room("склады", Mest.ONI);
		Room photolab = new Room("фотолаборатории", Mest.ONI);
		Room nii = new Room("научно-исследовательские институты", Mest.ONI);
		Room railway = new Room("подлунная железная дорога", Mest.ONA);
		Project project = new Project("проект");
		Rocket fis = new Rocket("ФИС", Mest.ONO);
		Rocket nip = new Rocket("НИП", Mest.ONO);
		Flute flute = new Flute();
		Stone.Granit granit = new Stone.Granit("гранит");
		Stone.OtherStone otherstone = new Stone.OtherStone("какой-нибудь другой красивый камень");
		Stone.Loonit loonit = new Stone.Loonit("лунит");
		Stone.Antiloonit antiloonit = new Stone.Antiloonit("антилунит");
		Physical.Temperature temp = new Physical.Temperature("температура ");
		Physical.Weight weight = new Physical.Weight("вес ");
		Physical.ThConductivity heat = new Physical.ThConductivity("теплопроводность ");
		Physical.ElConductivity electric = new Physical.ElConductivity("электропроводность ");

                starmen.supper();
                System.out.print("и ");
                starmen.left(fis.getName());
                System.out.print(", ");
                starmen.moved(nip.getName());
                System.out.println("");

                pilulkin.say(nip.better(fis.getName()));
                System.out.println("");

                pilulkin.betterWatchOver(fis.getName(),nip.getName());
                System.out.print(", но ");
                pilulkin.givein();
                System.out.println("");

                pilulkin.say(pilulkin.watchOver());
                System.out.print(", а ");
                pilulkin.meanIt();
                System.out.println("");

                pilulkin.slept(8);
		System.out.println("");

                Korotishki korotishki = new Korotishki() {
        	final String name = "Коротышки";
			@Override
			public void doSomething() {
				System.out.print(name+" занялись каждый своим делом:");
			}

			@Override
			public String liveOnMoon() {
				return(name+" жить на Луне ");
			}
		};
                korotishki.doSomething();
		System.out.println("");

		tubik.want(tubik.takeOffSuit());
		System.out.println("");

		tubik.want(tubik.draw(moon.landscape.getName1()));
		System.out.println("");

		guslya.took(flute.getName());
		System.out.print(" и ");
		guslya.whistle(flute.melody.getName2(),"PAST");
		System.out.println("");

                guslya.feel(flute.melody.slide());
                System.out.print(", тогда ");
                Human.Paper paper = new Human.Paper("бумага");
                guslya.took(paper.getNamePaper());
                System.out.print(" и ");
                guslya.writeSymphony("PAST");
		System.out.println("");

		guslya.whistle(flute.melody.getName2(),"PRESENT");
		guslya.writeSymphony("PRESENT");
		System.out.println("");

		pilulkin.hurt(guslya.getName());
		System.out.println("");

		kubik.think("FAST");
		System.out.print("и ");
		kubik.startCreate();
		project.print("LONG");
		cave.reform(moon.print(Predlog.NA));
		System.out.println("");

		project.print("THIS");
		System.out.print(": ");
		entrance.found(wall.getName());
		System.out.print("в которой ");
		door.place();
		System.out.print(" и ");
		sluice.place();
		cave.fill("AFTER");
		System.out.println("");

		wallsfloor.facing(granit.getName());
		System.out.print(" или ");
		wallsfloor.facing(otherstone.getName());
		System.out.println("");

		cave.nearby(moon.cover(Predlog.NA));
		solarbatteries.place();
		solarbatteries.produce(electricity.light(cave.getName()));
		System.out.print(" и");
		solarbatteries.produce(electricity.heat(cave.getName()));
		System.out.println("");

		inners.convert("SLOW");
		System.out.println(": ");
		rooms.appear();
		corridors.appear();
		halls.appear();
		downs.appear();
		elevators.appear();
		callbox.appear();
		hutch.appear();
		storage.appear();
		photolab.appear();
		nii.appear();
		railway.appear();
		railway.conect(othercave.getName());
		System.out.println("");

		project.improve("FAST");
		System.out.println("");

		vintikandshpuntik.thinkDeliver(cave.getName(),rocket.getName());
		System.out.print("и ");
		vintikandshpuntik.thinkLaunch(rocket.getName(),moon.print(Predlog.INSIDE));
		System.out.println("");

		vintikandshpuntik.finishedThink("LONG",tale.attach(rocket.getName()));
		System.out.println("");
		vintikandshpuntik.finishedThink("LONG",wheels.attach(rocket.getName()));
		System.out.println("чтобы ");
		rocket.freeRide(moon.print(Predlog.PO));
		trubolet.like();
		System.out.println("");

		vintikandshpuntik.notThink("ONLY",wheels.whereTake(moon.print(Predlog.NA)));
		System.out.println("");

		klyopka.jump(moon.print(Predlog.PO));
		System.out.println("");

		klyopka.gotTired();
		System.out.println("");

		Specifications spec = new Specifications() {
			@Override
			public String advantage(String what) {
				return "преимущества "+what;
			}

			@Override
			public String disadvantage(String what) {
				return "недостатки "+what;
			}

			@Override
			public String amount(Integer inte) {
				return "= "+inte.toString();
			}
		};
		klyopka.discovered(spec.advantage(korotishki.liveOnMoon())+"и " +spec.disadvantage(korotishki.liveOnMoon()));
		System.out.println("");

		klyopka.finishedThink("LONG", ": "+spec.advantage(spec.amount(4))+", а "+spec.disadvantage(spec.amount(256)));
		System.out.println("");

		znaykazvezdochkin.discovered(antiloonit.getName());
		System.out.println("");

		znaykazvezdochkin.say(antiloonit.opposite(loonit.getName()));
		System.out.println("");
		antiloonit.definition(Colors.PURPLE.getTitle()+", "+Colors.BLUE.getTitle());
		loonit.definition(Colors.YELLOW.getTitle()+", "+Colors.GREEN.getTitle()+", "+Colors.GRAYBROWNRED.getTitle());
		antiloonit.definition(heat.getName()+Condition.BAD.getTitle());
		loonit.definition(heat.getName()+Condition.GOOD.getTitle());
		antiloonit.definition(electric.getName()+Condition.GOOD.getTitle());
		loonit.definition(electric.getName()+Condition.BAD.getTitle());
		antiloonit.definition(weight.getName()+Condition.SMALL.getTitle());
		loonit.definition(weight.getName()+Condition.BIG.getTitle());
		antiloonit.definition(temp.getName()+Condition.LOW.getTitle());
		loonit.definition(temp.getName()+Condition.HIGH.getTitle());
		antiloonit.definition(Condition.SHALLOW.getTitle()+moon.print(Predlog.INSIDE));
		loonit.definition(Condition.DEEP.getTitle()+moon.print(Predlog.INSIDE));
		System.out.println("");
	}

}
