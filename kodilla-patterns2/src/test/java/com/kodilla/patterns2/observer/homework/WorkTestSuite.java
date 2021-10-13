package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkTestSuite {

    @Test
    public void updateWorkNumberFinished() {
        //Given
        Follower follower1 = new Follower("Amanda", "Johns");
        Follower follower2 = new Follower("Tony", "Stark");
        Follower follower3 = new Follower("John", "Black");

        Instructor instructor1 = new Instructor("Instructor 1");
        Instructor instructor2 = new Instructor("Instructor 2");

        Work work1 = new Work("1.1", "Subject-1");
        Work work2 = new Work("1.2", "Subject-2");
        Work work3 = new Work("1.3", "Subject-3");

        //When
        follower1.registerObserver(instructor1);
        follower2.registerObserver(instructor2);
        follower3.registerObserver(instructor1);
        follower1.registerObserver(instructor1);
        follower1.putToQueue(work2);
        follower2.putToQueue(work1);
        follower1.putToQueue(work3);
        follower3.putToQueue(work1);
        follower3.putToQueue(work2);

        //Then
        assertEquals(6, instructor1.getUpdateCount());
        assertEquals(1, instructor2.getUpdateCount());
    }

}

