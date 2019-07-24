package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String decorate, PoemDecorator poemDecorator) {
        String result = poemDecorator.decorate(decorate);
        System.out.println("Decorate result: " + result);
    }
}


//    public void executeExpression(double a, double b, MathExpression mathExpression) {
//        double result = mathExpression.calculateExpression(a, b);
//        System.out.println("Result equals: " + result);
