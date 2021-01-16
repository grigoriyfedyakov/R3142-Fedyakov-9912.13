public enum Condition {
    VISIBLE("непрозрачный"),
    INVISIBLE("прозрачный"),
    BIG("большой"),
    SMALL("небольшой"),
    HIGH("высокая"),
    LOW("низкая"),
    DEEP("глубоко"),
    SHALLOW("неглубоко"),
    BAD("плохая"),
    GOOD("хорошая");
    private String title;
    Condition(String title) {
        this.title=title;
    }
    public String getTitle(){return title;}
}
