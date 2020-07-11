package com.LearnToCode;

public abstract class UIControl {
    private boolean isEnabled = true;

//    public UIControl (boolean isEnabled) {
//        this.isEnabled = isEnabled;
//    }

    public void enable() {
        isEnabled = true;
    }

    public void disable() {
        isEnabled = false;
    }

    public boolean isEnabled () {
        return isEnabled;
    }

    public abstract void render();
}
