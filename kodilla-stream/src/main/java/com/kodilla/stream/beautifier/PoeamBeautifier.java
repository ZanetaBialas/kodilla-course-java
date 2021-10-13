package com.kodilla.stream.beautifier;

public class PoeamBeautifier {
    public String beautifierText(String text, PoemDecorator poemDecorator) {
        return poemDecorator.decorate(text);
    }
}
