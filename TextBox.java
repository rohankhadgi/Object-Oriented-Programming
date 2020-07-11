package com.LearnToCode;

public class TextBox extends UIControl {
    private String text = ""; // field


    public String toString() {
        return text;
    }

    public void setText(String text) { //method
        this.text = text;
    }

    public void clear() {  //method
        text = "";
    }

    @Override
    public void render() {
        System.out.println("Render TextBox");
    }
}
