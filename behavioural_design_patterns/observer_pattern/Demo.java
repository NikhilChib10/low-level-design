package behavioural_design_patterns.observer_pattern;

import behavioural_design_patterns.observer_pattern.editor.Editor;
import behavioural_design_patterns.observer_pattern.listeners.EmailNotificationListener;
import behavioural_design_patterns.observer_pattern.listeners.LogOpenListener;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}