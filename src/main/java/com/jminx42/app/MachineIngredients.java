package com.jminx42.app;

public class MachineIngredients {
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;

    public MachineIngredients(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water = water;
        this.milk = milk;
        this.coffeeBeans = coffeeBeans;
        this.cups = cups;
        this.money = money;
    }

    public int getWater() {
        return water;
    }

    public void addWater(int water) {
        this.water += water;
    }

    public void removeWater(int water) {
        this.water -= water;
    }



    public int getMilk() {
        return milk;
    }

    public void addMilk(int milk) {
        this.milk += milk;
    }

    public void removeMilk(int milk) {
        this.milk -= milk;
    }



    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    public void addCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans += coffeeBeans;
    }

    public void removeCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans -= coffeeBeans;
    }



    public int getCups() {
        return cups;
    }

    public void addCups(int cups) {
        this.cups += cups;
    }

    public void removeCups(int cups) {
        this.cups -= cups;
    }



    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }

    public void removeMoney(int money) {
        this.money -= money;
    }

    public boolean canMake(int water, int milk, int coffeeBeans, int cups) {
        boolean canMake = false;
        if (this.water >= water && this.milk >= milk && this.coffeeBeans >= coffeeBeans && this.cups >= cups) {
            canMake = true;
        }
        return canMake;
    }

    public void make(int water, int milk, int coffeeBeans, int cups, int money) {
        this.water -= water;
        this.milk -= milk;
        this.coffeeBeans -= coffeeBeans;
        this.cups -= cups;
        this.money += money;
    }
}
