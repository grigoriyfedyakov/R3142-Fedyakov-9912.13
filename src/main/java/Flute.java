public class Flute {
    private String name;
    public Flute() { this.name="флейта"; }
    public String getName(){return name;}
    Melody melody = new Melody();
    public class Melody {
        private String name2;
        public Melody(){ this.name2="мелодии"; }
        public String getName2(){return name2; }
        public String slide(){
            return(name2+" ускользают");
        }
    }
}
