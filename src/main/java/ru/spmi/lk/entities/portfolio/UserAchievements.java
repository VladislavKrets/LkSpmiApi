package ru.spmi.lk.entities.portfolio;

public class UserAchievements {
    private UserAchievementsItem[] items;
    private UserAchievementsPoints points;
    private int min_year;

    public UserAchievementsItem[] getItems() {
        return items;
    }

    public UserAchievementsPoints getPoints() {
        return points;
    }

    public int getMinYear() {
        return min_year;
    }
}
