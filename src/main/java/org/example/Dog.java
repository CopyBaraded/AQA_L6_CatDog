package org.example;

public class Dog extends Animal {


//    public Dog(String name, int run, int swim, int jump) {
//        super(name, run, swim, jump);
    //}
    int maxJamp = 5;
    int maxRun = 500;
    int maxSwim = 10;
    int count = 0;
    public Dog(){
        getCount();
    }

    @Override
    public void jamp(String name, int heightJump) {
        if (heightJump <= maxJamp)
            System.out.println(name + " прыгнул " + heightJump + " м ");
        else
            System.out.println(name + " не прыгнул " + heightJump + " м ");
    }

    @Override
    public void run(String name, int distRun){
        if (distRun <= maxRun)
            System.out.println(name + " пробежал " + distRun + " м ");
        else
            System.out.println(name + " не пробежал " + distRun + " м ");
    }

    @Override
    public void swim(String name, int distSwim) {
        if (distSwim <= maxSwim)
            System.out.println(name + " проплыл " + distSwim + " м ");
        else
            System.out.println(name + " не проплыл " + distSwim + " м ");
    }

    public void getCount() {

        count++;
    }

}
