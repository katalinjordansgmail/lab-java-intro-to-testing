package com.ironhack;

abstract public class Player {
    private int health;
    private int initialHealth;
    private int strength;
    private int lives;

    public Player(int health, int strength, int lives) {
        setHealth(health);
        setInitialHealth(health);
        setStrength(strength);
        setLives(lives);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getInitialHealth() {
        return initialHealth;
    }

    public void setInitialHealth(int health) {
        this.initialHealth = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public void decrementLive() {
        setLives(getLives() - 1);
        setHealth(getInitialHealth());
        if (getLives() <= 0) {
            System.out.println("This character is dead");
        }
    }

    public void attack(Player playerToAttack) {
        playerToAttack.setHealth(playerToAttack.getHealth() - getStrength());
    }

    public void checkHealth() {
        if(getHealth() <= 0) {
            decrementLive();
        }
    }
}
