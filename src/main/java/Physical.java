public abstract class Physical {
    public static class Temperature {
        private String name;
        public Temperature(String name) { this.name = name; }
        public String getName() { return name; }

    }
    public static class Weight {
        private String name;
        public Weight(String name) { this.name = name; }
        public String getName() { return name; }

    }
    public static class ElConductivity {
        private String name;
        public ElConductivity(String name) { this.name = name; }
        public String getName() { return name; }

    }
    public static class ThConductivity {
        private String name;
        public ThConductivity(String name) { this.name = name; }
        public String getName() { return name; }

    }
    public static class Electricity {
        private String name;
        public Electricity(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public String light(String str) { return(name+ " для освещения "+str); }
        public String heat(String str) { return(name+" для отопления "+str); }
    }
}
