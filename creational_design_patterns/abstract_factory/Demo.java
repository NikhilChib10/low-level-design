package creational_design_patterns.abstract_factory;

import creational_design_patterns.abstract_factory.factory.MacOSFactory;
import creational_design_patterns.abstract_factory.factory.WindowsFactory;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Application> applicationList = new ArrayList<>();
        applicationList.add(new Application(new WindowsFactory()));
        applicationList.add(new Application(new MacOSFactory()));

        for(Application app: applicationList) {
            app.paint();
        }
    }
}
