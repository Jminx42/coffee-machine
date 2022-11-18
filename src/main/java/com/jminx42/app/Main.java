package com.jminx42.app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MachineIngredients machineIngredients = new MachineIngredients(400, 540, 120, 9, 550);

        String userAction = "";

        while (!(userAction.equals("exit"))){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            userAction = scanner.nextLine();
            System.out.println();
            machineAction(userAction, machineIngredients);
            System.out.println();
        }

    }

    public static void machineAction(String userAction, MachineIngredients machineIngredients) {

        switch (userAction) {
            case "buy":
                buy(machineIngredients);
                break;

            case "fill":
                fill(machineIngredients);
                break;

            case "take":
                take(machineIngredients);
                break;

            case "remaining":
                remaining(machineIngredients);
                break;

            case "exit":

                break;
        }

    }


    public static void remaining(MachineIngredients machineIngredients) {
        System.out.println("The coffee machine has: ");
        System.out.println(machineIngredients.getWater() + " ml of water");
        System.out.println(machineIngredients.getMilk() + " ml of milk");
        System.out.println(machineIngredients.getCoffeeBeans() + " g of coffee beans");
        System.out.println(machineIngredients.getCups() + " disposable cups");
        System.out.println("$" + machineIngredients.getMoney() + " of money");
    }

    public static void buy(MachineIngredients machineIngredients) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String userBuy = scanner.nextLine();


        switch (userBuy) {
            case "1":
                int espWater = 250;
                int espMilk = 0;
                int espBeans = 16;
                int espCups = 1;
                int espCost = 4;

                if (machineIngredients.canMake(espWater, espMilk, espBeans, espCups)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    machineIngredients.make(espWater, espMilk, espBeans, espCups, espCost);
                } else if (!(machineIngredients.canMake(espWater, espMilk, espBeans, espCups))) {
                    if (espWater > machineIngredients.getWater()) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (espBeans > machineIngredients.getCoffeeBeans()) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if (espCups > machineIngredients.getCups()) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }

                break;

            case "2":
                int latWater = 350;
                int latMilk = 75;
                int latBeans = 20;
                int latCups = 1;
                int latCost = 7;

                if (machineIngredients.canMake(latWater, latMilk, latBeans, latCups)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    machineIngredients.make(latWater, latMilk, latBeans, latCups, latCost);
                } else if (!(machineIngredients.canMake(latWater, latMilk, latBeans, latCups))) {
                    if (latWater > machineIngredients.getWater()) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (latMilk > machineIngredients.getMilk()) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (latBeans > machineIngredients.getCoffeeBeans()) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if (latCups > machineIngredients.getCups()) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }

                break;

            case "3":
                int capWater = 200;
                int capMilk = 100;
                int capBeans = 12;
                int capCups = 1;
                int capCost = 6;

                if (machineIngredients.canMake(capWater, capMilk, capBeans, capCups)) {
                    System.out.println("I have enough resources, making you a coffee!");
                    machineIngredients.make(capWater, capMilk, capBeans, capCups, capCost);
                } else if (!(machineIngredients.canMake(capWater, capMilk, capBeans, capCups))) {
                    if (capWater > machineIngredients.getWater()) {
                        System.out.println("Sorry, not enough water!");
                    }
                    if (capMilk > machineIngredients.getMilk()) {
                        System.out.println("Sorry, not enough milk!");
                    }
                    if (capBeans > machineIngredients.getCoffeeBeans()) {
                        System.out.println("Sorry, not enough coffee beans!");
                    }
                    if (capCups > machineIngredients.getCups()) {
                        System.out.println("Sorry, not enough disposable cups!");
                    }
                }

                break;

            case "back":

                break;
        }

    }


    public static void fill(MachineIngredients machineIngredients) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add:");
        int addWater = scanner.nextInt();

        System.out.println("Write how many ml of milk you want to add:");
        int addMilk = scanner.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add:");
        int addBeans = scanner.nextInt();

        System.out.println("Write how many disposable cups of coffee you want to add:");
        int addDisposableCups = scanner.nextInt();

        machineIngredients.addWater(addWater);
        machineIngredients.addMilk(addMilk);
        machineIngredients.addCoffeeBeans(addBeans);
        machineIngredients.addCups(addDisposableCups);


    }

    public static void take(MachineIngredients machineIngredients) {

        System.out.println("I gave you $" + machineIngredients.getMoney());
        machineIngredients.removeMoney(machineIngredients.getMoney());

    }


}