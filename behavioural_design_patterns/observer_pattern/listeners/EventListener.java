package behavioural_design_patterns.observer_pattern.listeners;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}