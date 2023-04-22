package com.mrbing.hashmap;

public class Population {
    private String city;
    private int population;

    public Population() {
    }

    public Population(String city, int population) {
        this.city = city;
        this.population = population;
    }

    /**
     * 获取
     *
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * 设置
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * 获取
     *
     * @return population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * 设置
     *
     * @param population
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "{城市:" + city + ",人口:" + population + "}";
    }
}
