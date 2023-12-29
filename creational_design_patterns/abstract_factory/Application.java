package creational_design_patterns.abstract_factory;

import creational_design_patterns.abstract_factory.factory.UIFactory;
import creational_design_patterns.abstract_factory.model.button.Button;
import creational_design_patterns.abstract_factory.model.checkbox.CheckBox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(UIFactory factory) {
        button = factory.createButton();
        checkBox = factory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkBox.paint();
    }
}
