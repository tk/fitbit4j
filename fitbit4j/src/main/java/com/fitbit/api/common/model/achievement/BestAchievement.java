package com.fitbit.api.common.model.achievement;

import com.fitbit.api.common.service.FitbitApiService;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by IntelliJ IDEA.
 * User: Kiryl
 * Date: 10/18/11
 * Time: 12:56 AM
 */
public class BestAchievement {

    private BestAchievementItem<Long> caloriesOut;
    private BestAchievementItem<Long> floors;
    private BestAchievementItem<Double> distance;
    private BestAchievementItem<Long> steps;
    private BestAchievementItem<Long> activeScore;

    public BestAchievement(BestAchievementItem<Long> caloriesOut, BestAchievementItem<Long> floors, BestAchievementItem<Double> distance, BestAchievementItem<Long> steps, BestAchievementItem<Long> activeScore) {
        this.caloriesOut = caloriesOut;
        this.floors = floors;
        this.distance = distance;
        this.steps = steps;
        this.activeScore = activeScore;
    }

    public BestAchievement(JSONObject jsonObject) throws JSONException {
        if (jsonObject.has("caloriesOut")) {
            this.caloriesOut = new BestAchievementItem<Long>(jsonObject.getJSONObject("caloriesOut").getLong("value"), FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(jsonObject.getJSONObject("caloriesOut").getString("date")).toLocalDate());
        }
        if (jsonObject.has("floors")) {
            this.floors = new BestAchievementItem<Long>(jsonObject.getJSONObject("floors").getLong("value"), FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(jsonObject.getJSONObject("floors").getString("date")).toLocalDate());
        }
        if (jsonObject.has("distance")) {
            this.distance = new BestAchievementItem<Double>(jsonObject.getJSONObject("distance").getDouble("value"), FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(jsonObject.getJSONObject("distance").getString("date")).toLocalDate());
        }
        if (jsonObject.has("steps")) {
            this.steps = new BestAchievementItem<Long>(jsonObject.getJSONObject("steps").getLong("value"), FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(jsonObject.getJSONObject("steps").getString("date")).toLocalDate());
        }
        if (jsonObject.has("activeScore")) {
            this.activeScore = new BestAchievementItem<Long>(jsonObject.getJSONObject("activeScore").getLong("value"), FitbitApiService.LOCAL_DATE_FORMATTER.parseDateTime(jsonObject.getJSONObject("activeScore").getString("date")).toLocalDate());
        }
    }

    public BestAchievementItem<Long> getCaloriesOut() {
        return caloriesOut;
    }

    public BestAchievementItem<Long> getFloors() {
        return floors;
    }

    public BestAchievementItem<Double> getDistance() {
        return distance;
    }

    public BestAchievementItem<Long> getSteps() {
        return steps;
    }

    public BestAchievementItem<Long> getActiveScore() {
        return activeScore;
    }
}
