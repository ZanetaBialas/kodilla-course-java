package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    void testDefaulSharingStrategies() {

        //Given
        User userMax = new Millenials("Max Smith");
        User userSara = new YGeneration("Sara Johns");
        User userAnna = new ZGeneration("Anna Kennedy");

        //When
        String userMaxSocialMedium = userMax.sharePost();
        String userSaraSocialMedium = userSara.sharePost();
        String userAnnaSocialMedium = userAnna.sharePost();

        //Then
        assertEquals("Facebook", userMaxSocialMedium);
        assertEquals("Snapchat", userSaraSocialMedium);
        assertEquals("Twitter", userAnnaSocialMedium);
    }

    @Test
    void testIndividualSharingStrategy() {

        //Given
        User userMax = new Millenials("Max Smith");
        //When
        String userMaxSocialMedium = userMax.sharePost();
        System.out.println("User Max use: " + userMaxSocialMedium);
        userMax.setSharingStrategy(new FacebookPublisher());
        System.out.println("User Max now use: " + userMaxSocialMedium);
        userMaxSocialMedium = userMax.sharePost();
        //Then
        assertEquals("Facebook", userMaxSocialMedium);

    }
}
