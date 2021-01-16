public enum Colors {
    PURPLE("фиолетовый"),
    BLUE("синеватый"),
    YELLOW("желтоватый"),
    GREEN("зеленоватый"),
    GRAYBROWNRED("серо-буро-малиновый");
    private String title;
    Colors(String title) {
        this.title=title;
    }
    public String getTitle(){return title;}
}
