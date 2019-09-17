package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser("1", "Marcin", 'M', 1990, 7, 12, 23));
        forumUserList.add(new ForumUser("2", "Pawel", 'M', 1990, 7, 12, 10));
        forumUserList.add(new ForumUser("3", "Piotr", 'M', 1990, 7, 12,0));
        forumUserList.add(new ForumUser("4", "Natalia", 'F', 1990, 7, 12,4));
        forumUserList.add(new ForumUser("5", "Ewa", 'F', 1997, 7, 12,6));
        forumUserList.add(new ForumUser("6", "Tomek", 'M', 2001, 7, 12,0));
        forumUserList.add(new ForumUser("7", "Robert", 'M', 2003, 7, 12, 12));
        forumUserList.add(new ForumUser("8", "Magda", 'F', 2001, 7, 12,11));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
