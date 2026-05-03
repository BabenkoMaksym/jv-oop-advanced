package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private final int firstLeg;
    private final int secondLeg;
    private final int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
        setArea(((double) (firstLeg + secondLeg) / 2) * height);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() +
                " sq. units, firstLeg: " + firstLeg +
                " sq. units, secondLeg: " + secondLeg +
                " sq. units, height: " + height +
                " units, color: "+ getColor());
    }

}
