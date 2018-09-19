package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.stream.forumuser.ForumUser.Gender.F;
import static com.kodilla.stream.forumuser.ForumUser.Gender.M;

public final class Forum {
    List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1,"rafal1", M, 1988,
                12, 19, 13 ));
        usersList.add(new ForumUser(2,"kazik15", M, 2005,
                2, 11, 111 ));
        usersList.add(new ForumUser(3,"genia2", F, 1977,
                10, 29, 136 ));
        usersList.add(new ForumUser(4,"kazia45", F, 1998,
                3, 3, 0 ));
        usersList.add(new ForumUser(5,"mateusz545", M, 1995,
                6, 12, 7 ));
        usersList.add(new ForumUser(6,"ann21", F, 1982,
                9, 1, 54 ));
        usersList.add(new ForumUser(7,"ann28", F, 1981,
                9, 11, 0 ));
    }
    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }
}
