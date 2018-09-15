package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {
    private Statistic statistic;

    double numberOfUsers;
    double numberOfPosts;
    double numberOfComments;

    double averageNumberOfPostsForUsers;
    double averageNumberOfCommentsForUsers;
    double averageNumberOfCommentsForPosts;

    public void calculateAdvStatistics (Statistic statistic) {
        this.statistic = statistic;

        numberOfUsers = statistic.usersNames().size();
        numberOfPosts = statistic.postsCount();
        numberOfComments = statistic.commentsCount();
        if (numberOfUsers>0) {
            averageNumberOfPostsForUsers = numberOfPosts / numberOfUsers;
            averageNumberOfCommentsForUsers = numberOfComments / numberOfUsers;
        }else{
            averageNumberOfPostsForUsers = 0;
            averageNumberOfCommentsForUsers = 0;
        }
        if (numberOfPosts>0) {
            averageNumberOfCommentsForPosts = numberOfComments /numberOfPosts;
        }else{
            averageNumberOfCommentsForPosts = 0;
        }

    }

    public void showStatistic() {
         System.out.println("Number of users: "+numberOfUsers +'\n'+ "Number of posts: "+ numberOfPosts+'\n'
                 +"Number of comments: "+numberOfComments+'\n'+ "Average posts/users: "+averageNumberOfPostsForUsers +
                 '\n'+ "Average comments/users: " +averageNumberOfCommentsForUsers+'\n'+ "Average comments/posts: "
                 +averageNumberOfCommentsForPosts);
        }
//    }
    public double getNumberOfUsers() {
        return numberOfUsers;
    }

      public double getNumberOfPosts() {
        return numberOfPosts;
    }

    public double getNumberOfComments() {
        return numberOfComments;
    }

    public double getAverageNumberOfPostsForUsers() {
        return averageNumberOfPostsForUsers;
    }

    public double getAverageNumberOfCommentsForUsers() {
        return averageNumberOfCommentsForUsers;
    }

    public double getAverageNumberOfCommentsForPosts() {
        return averageNumberOfCommentsForPosts;
    }
}
