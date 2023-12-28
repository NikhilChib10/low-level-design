package creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.models;

public class HTMLButton implements Button{

    @Override
    public void onClick(String op) {
        System.out.println("Click! - HTML Button has been clicked. Operation: " + op);
    }

    @Override
    public void render() {
        System.out.println("HTML Button Rendered Successfully");
    }
}
