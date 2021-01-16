public class WallsFloor extends Cave{
    private String name;
    public WallsFloor(String name) {
        super(name);
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void facing(String str) {
        System.out.print(name+" облицовывались "+ str);
    }
}
