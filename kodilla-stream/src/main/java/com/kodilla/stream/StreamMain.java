package com.kodilla.stream;

import com.kodilla.stream.beautifier.DecorateMethods;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a + b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a - b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a * b));
        expressionExecutor.executeExpression(10, 5, ((a, b) -> a / b));

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println("Text beautifier: ");

        poemBeautifier.beautify("Rafal", DecorateMethods::addABCAtTheBeginningAndEnd);
        poemBeautifier.beautify("make me upper case", DecorateMethods::toUpperCaseText);
        poemBeautifier.beautify("MAKE ME SMALL LETTERS", DecorateMethods::toLowerCaseText);
        poemBeautifier.beautify("HELLO", DecorateMethods::addStarsAtTheBeginningAndEnd);

    }
}