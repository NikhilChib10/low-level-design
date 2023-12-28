package creational_design_patterns.factory_method.example1_cross_platform_ui_dialog;

import creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.dialog.Dialog;
import creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.dialog.HTMLDialog;
import creational_design_patterns.factory_method.example1_cross_platform_ui_dialog.dialog.WindowsDialog;

public class Client {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.renderWindow();

        dialog = new HTMLDialog();
        dialog.renderWindow();
    }
}
