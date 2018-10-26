package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User rafal = new Millenials("rafal12");
        User kasia = new YGeneration("kasia18");
        User mateusz = new ZGeneration("mati5");
        //When
        String rafalPosted = rafal.sharePost();
        System.out.println("rafal12: " + rafalPosted);
        String kasiaPosted = kasia.sharePost();
        System.out.println("kasia18: " + kasiaPosted);
        String mateuszPosted = mateusz.sharePost();
        System.out.println("mati5: " + mateuszPosted);
        //Then
        Assert.assertEquals("Published by Facebook", rafalPosted);
        Assert.assertEquals("Published by Snapchat", kasiaPosted);
        Assert.assertEquals("Published by Twitter", mateuszPosted);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User rafal = new Millenials("rafal12");
        //When
        String rafalPosted = rafal.sharePost();
        System.out.println("rafal12: " + rafalPosted);
        rafal.setPublisher(new TwitterPublisher());
        rafalPosted = rafal.sharePost();
        System.out.println("rafal12 change publisher: " + rafalPosted);
        //Then
        Assert.assertEquals("Published by Twitter", rafalPosted);
    }
}
