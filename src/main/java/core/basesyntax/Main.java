package core.basesyntax;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {
        final int randomMaxNumber = 101;

        FigureSupplier figureSupplier = new FigureSupplier();

        int[] sides = new int[]{
                RandomUtils.getRandomInt(randomMaxNumber),
                RandomUtils.getRandomInt(randomMaxNumber),
                RandomUtils.getRandomInt(randomMaxNumber)
        };

        List<Figure> figures = new ArrayList<>();
        figures.add(figureSupplier.getRandomFigure(sides));
        figures.add(figureSupplier.getDefaultFigure());

        figures.forEach(Figure::draw);
    }

}
