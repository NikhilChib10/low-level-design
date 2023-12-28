package creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.dialog;

import creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.models.Button;

public abstract class Dialog {
    public abstract Button createButton();

    public void renderWindow() {
        Button okButton = createButton();
        okButton.onClick("closeDialog");
        okButton.render();
    }
}
