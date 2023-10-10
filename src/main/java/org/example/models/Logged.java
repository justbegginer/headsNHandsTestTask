package org.example.models;

public abstract class Logged {
    private boolean isNeedToBePrinted;

    protected Logged(boolean isNeedToBePrinted){
        this.isNeedToBePrinted = isNeedToBePrinted;
    }

    public boolean isNeedToBePrinted() {
        return isNeedToBePrinted;
    }

    public void setNeedToBePrinted(boolean needToBePrinted) {
        isNeedToBePrinted = needToBePrinted;
    }

    public void print(String message){
        if (isNeedToBePrinted)
            System.out.println(message);
    }
}
