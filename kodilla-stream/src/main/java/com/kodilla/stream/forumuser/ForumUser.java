package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int numberIDUser;
    private final String name;
    private final char sex;
    private final LocalDate birthdayDate;
    private final int postsQty;

    public ForumUser(final int numberIDUser, final String name, final char sex, final LocalDate birthdayDate, final int postsQty) {
        this.numberIDUser = numberIDUser;
        this.name = name;
        this.sex = sex;
        this.birthdayDate = birthdayDate;
        this.postsQty = postsQty;
    }

    public int getNumberIDUser ( ) {
        return numberIDUser;
    }

    public String getName ( ) {
        return name;
    }

    public char getSex ( ) {
        return sex;
    }

    public LocalDate getBirthdayDate ( ) {
        return birthdayDate;
    }

    public int getPostsQty ( ) {
        return postsQty;
    }

    @Override
    public String toString() {
        return  "ForumUser {" + "numberIDUser= " + numberIDUser + '\'' + ", name=" + name + '\'' + ", sex" + sex + '\'' + ", birthadayDate=" + birthdayDate + ", postsQty=" +postsQty + '}';
    }
}
