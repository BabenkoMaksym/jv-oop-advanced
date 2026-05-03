package core.basesyntax;

public class FigureSupplier {

    private final int figureCount = 5;
    private ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int[] sides) {
        int figureIndex = RandomUtils.getRandomInt(figureCount);

        switch (figureIndex) {
            case 1: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        sides[0], sides[1], sides[2]);
            case 2: return new Rectangle(colorSupplier.getRandomColor(), sides[0], sides[1]);
            case 3: return new RightTriangle(colorSupplier.getRandomColor(),sides[0]);
            case 4: return new Square(colorSupplier.getRandomColor(), sides[0]);
            default: return new Circle(colorSupplier.getRandomColor(), sides[0]);

        }
    }

    ;

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(), 10);
    }

    ;

}
