package core.basesyntax;

public class ColorSupplier {

    public String getRandomColor() {
        Color[] colors = Color.values();
        return colors[RandomUtils.getRandomInt(colors.length)].name();
    }

}
