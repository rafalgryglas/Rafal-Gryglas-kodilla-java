package com.kodilla.patterns2.observer.homework;

public class KodillaMentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public KodillaMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    public String getMentorName() {
        return mentorName;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println("You [" + getMentorName() + "} got a new homework to check from: " + homeworkQueue.getKodillaUser() +
                ", about: " + homeworkQueue.getHomeworksQueue().peekLast().getTitle() + "[" +
                homeworkQueue.getHomeworksQueue().peekLast().getId() + "]");
        updateCount++;
    }
}
