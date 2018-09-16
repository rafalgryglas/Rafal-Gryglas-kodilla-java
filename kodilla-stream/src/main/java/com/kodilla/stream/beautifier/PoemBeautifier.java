package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String textToBeauty, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(textToBeauty);
        System.out.println("Result decorate: " + result);
    }
}
