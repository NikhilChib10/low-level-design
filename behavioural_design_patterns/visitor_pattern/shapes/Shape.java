package behavioural_design_patterns.visitor_pattern.shapes;

import behavioural_design_patterns.visitor_pattern.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
