package com.example.hellospring.workshop01;

public class FizzBuzz {

    private int input;

    public FizzBuzz(int input){
        this.input = input;
    }

    public String getResult() {
        // Prepare all conditions
        MyCondition[] conditions = new MyCondition[]{
                new FizzBuzzCondition(),
                new FizzCondition(),
                new BuzzCondition(),
                new KBTGCondition()
        };

        for (MyCondition condition : conditions) {
            if(condition.check(this.input)) {
                return condition.print();
            }
        }

        return Integer.toString(this.input);
    }
}