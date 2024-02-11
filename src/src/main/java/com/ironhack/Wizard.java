package com.ironhack;

public class Wizard extends Player {
    private int spell;

    public Wizard(int health, int strength, int lives, int spell) {
        super(health, strength, lives);
        setSpell(spell);
    }

    public int getSpell() {
        return spell;
    }

    public void setSpell(int spell) {
        this.spell = spell;
    }

    public Elf convertToElf() {
        return new Elf(getHealth(), getStrength(), getLives(), getSpell());
    }
}
