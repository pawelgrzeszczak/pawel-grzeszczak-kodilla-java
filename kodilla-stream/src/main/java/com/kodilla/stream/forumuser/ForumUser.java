package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final String id;
    private final String name;
    private final char sex;
    private final LocalDate birthday;
    private final int postCount;

    public ForumUser(final String id, final String name, final char sex, final int yearOfBirth, final int mothOfBirth, final int dayOfBirth, final int postCount) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthday = LocalDate.of(yearOfBirth, mothOfBirth, dayOfBirth);
        this.postCount = postCount;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postCount=" + postCount +
                '}';
    }
}