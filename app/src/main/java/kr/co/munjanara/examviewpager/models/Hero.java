package kr.co.munjanara.examviewpager.models;

public class Hero extends Character {
    private boolean isFlying;

    public Hero(String name) {
        setName(name);
    }

    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void attack(Hero hero) {
        System.out.println(hero.getName() + " 완 싸움");
    }
}
