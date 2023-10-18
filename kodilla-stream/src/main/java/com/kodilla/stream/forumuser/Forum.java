package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> userList = new ArrayList<>();
    public void addToUserList(ForumUser forumUser) {
        userList.add(forumUser);
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
