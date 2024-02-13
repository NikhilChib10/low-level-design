package behavioural_design_patterns.iterator_pattern.social_networks;

import behavioural_design_patterns.iterator_pattern.iterators.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
