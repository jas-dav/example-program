package edu.greenriver.sdev.exampleprogram.model;

public class WeatherReadings {


    private String dataTime;
    private String location;
    private String condition; // foggy, rainy, sunny...
    private double tempFaren;


    public WeatherReadings(String dataTime, String location, String condition, double tempFaren) {
        this.dataTime = dataTime;
        this.location = location;
        this.condition = condition;
        this.tempFaren = tempFaren;
    }

    public String getDataTime() {
        return dataTime;
    }


    public void setDataTime(String dataTime) {
        this.dataTime = dataTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public double getTempFaren() {
        return tempFaren;
    }

    public void setTempFaren(double tempFaren) {
        this.tempFaren = tempFaren;
    }


    @Override
    public String toString() {
        return "WeatherReadings{" +
                "dataTime='" + dataTime + '\'' +
                ", location='" + location + '\'' +
                ", condition='" + condition + '\'' +
                ", tempFaren=" + tempFaren +
                '}';
    }



}