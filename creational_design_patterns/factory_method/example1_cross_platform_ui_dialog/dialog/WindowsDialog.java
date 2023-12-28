package creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.dialog;

import creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.models.Button;
import creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.models.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
