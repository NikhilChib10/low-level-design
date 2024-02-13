package behavioural_design_patterns.iterator_pattern.iterators;

import behavioural_design_patterns.iterator_pattern.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
