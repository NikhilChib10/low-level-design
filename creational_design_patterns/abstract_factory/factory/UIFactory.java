package creational_design_patterns.abstract_factory.factory;

import creational_design_patterns.abstract_factory.model.button.Button;
import creational_design_patterns.abstract_factory.model.checkbox.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
