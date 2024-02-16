package behavioural_design_patterns.visitor_pattern.visitor;

import behavioural_design_patterns.visitor_pattern.shapes.Circle;
import behavioural_design_patterns.visitor_pattern.shapes.CompoundShape;
import behavioural_design_patterns.visitor_pattern.shapes.Dot;
import behavioural_design_patterns.visitor_pattern.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}