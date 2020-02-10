package by.belhard.BPJ20.homework.homework04.exercise01;

public enum Lift {

    YES(true),
    NO(false),
    UNKNOWN(true);

    Lift(boolean working){
        this.working=working;
    }

    private boolean working;

    public boolean isWorking() {
        return working;
    }

    public void setWorking(boolean working) {
        this.working = working;
    }
}
