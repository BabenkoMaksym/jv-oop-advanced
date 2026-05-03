package core.basesyntax;

public class RightTriangle extends Figure{
    private final int triangleSide;

    public RightTriangle(String color, int triangleSide) {
        super(color);
        this.triangleSide = triangleSide;
        setArea((Math.pow(triangleSide, 2) * Math.sqrt(3)) / 4);
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea() +
                " sq. units, triangle side: " + triangleSide +
                " units, color: "+ getColor());
    }

}
