package behavioural_design_patterns.state_pattern;

import behavioural_design_patterns.state_pattern.ui.Player;
import behavioural_design_patterns.state_pattern.ui.UI;

/**
 * Demo class. Everything comes together here.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
