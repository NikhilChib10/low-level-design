package creational_design_patterns.abstract_factory.factory;

import creational_design_patterns.abstract_factory.model.button.Button;
import creational_design_patterns.abstract_factory.model.button.WindowsButton;
import creational_design_patterns.abstract_factory.model.checkbox.CheckBox;
import creational_design_patterns.abstract_factory.model.checkbox.WindowsCheckBox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindowsFactory implements UIFactory{

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }
}
