package com.Thread12;

public class Test {
    public static void main(String[] args) {

        Desk desk = new Desk();

        Foodie foodie = new Foodie(desk);
        Cooker cooker = new Cooker(desk);

        foodie.start();
        cooker.start();
    }
}
