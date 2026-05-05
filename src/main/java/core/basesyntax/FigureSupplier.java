package core.basesyntax;

public class FigureSupplier {

    public static final int FIGURE_COUNT = 5;
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int[] sides) {
        int figureIndex = RandomUtils.getRandomInt(FIGURE_COUNT);

        switch (figureIndex) {
            case 1: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        sides[0], sides[1], sides[2]);
            case 2: return new Rectangle(colorSupplier.getRandomColor(), sides[0], sides[1]);
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(), sides[0], sides[1]);
            case 4: return new Square(colorSupplier.getRandomColor(), sides[0]);
            default: return new Circle(colorSupplier.getRandomColor(), sides[0]);

        }
    }

    ;

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }

    ;

}
