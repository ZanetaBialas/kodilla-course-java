package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(1,"Loki", 'M', LocalDate.of(1987, Month.AUGUST, 30), 10));
        forumUserList.add(new ForumUser(2, "Thor", 'M', LocalDate.of(1990, Month.APRIL, 25), 22));
        forumUserList.add(new ForumUser(3, "Blue", 'F', LocalDate.of(1991, Month.DECEMBER, 10), 9));
        forumUserList.add(new ForumUser(4, "Mini", 'F', LocalDate.of(1989, Month.JUNE, 21), 31));
        forumUserList.add(new ForumUser(5, "Rose", 'F', LocalDate.of(1992, Month.MARCH, 13), 13));
        forumUserList.add(new ForumUser(6, "Adix", 'M', LocalDate.of(1989, Month.MAY, 25), 11));
        forumUserList.add(new ForumUser(7, "Lila", 'F', LocalDate.of(1996, Month.JANUARY, 1), 28));
        forumUserList.add(new ForumUser(8, "Bily", 'M', LocalDate.of(1990, Month.FEBRUARY, 23), 1));
        forumUserList.add(new ForumUser(9, "Molly", 'F', LocalDate.of(1993, Month.OCTOBER, 16), 32));

    }

    public List<ForumUser> getForumUserList() {
        return new ArrayList<>(forumUserList);
    }
}
