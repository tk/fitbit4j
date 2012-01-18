package com.fitbit.api.common.model.achievement;

import org.joda.time.LocalDate;

/**
 * Created by IntelliJ IDEA.
 * User: Kiryl
 * Date: 1/17/12
 * Time: 5:37 AM
 */
public class BestAchievementItem<T> {

    private T value;
    private LocalDate date;

    public BestAchievementItem(T value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    public T getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }
}
