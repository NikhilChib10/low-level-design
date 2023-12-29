package creational_design_patterns.abstract_factory.model.checkbox;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a checkbox.
 */
public class WindowsCheckBox implements CheckBox{
    @Override
    public void paint() {
        System.out.println("Created WindowsCheckBox");
    }
}
