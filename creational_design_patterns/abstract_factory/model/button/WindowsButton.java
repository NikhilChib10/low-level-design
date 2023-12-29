package creational_design_patterns.abstract_factory.model.button;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements Button{

    @Override
    public void paint() {
        System.out.println("Created WindowsButton");
    }
}
