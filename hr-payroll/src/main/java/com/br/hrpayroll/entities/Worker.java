package com.br.hrpayroll.entities;

public class Worker {

    private Long id;
    private String name;
    private Double dailyIncome;

    public Worker() {

    }

    public Worker(final Long id, final String name, final Double dailyIncome) {
        this.id = id;
        this.name = name;
        this.dailyIncome = dailyIncome;
    }

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Double getDailyIncome() {
        return dailyIncome;
    }

    public void setDailyIncome(final Double dailyIncome) {
        this.dailyIncome = dailyIncome;
    }
}
