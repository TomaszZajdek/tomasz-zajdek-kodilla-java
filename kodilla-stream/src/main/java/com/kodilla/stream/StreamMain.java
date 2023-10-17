package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {
        System.out.println("Calculating expressions with lambdas");
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5,(a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5,(a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5,(a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5,(a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String word = "Kodilla lambda";
        poemBeautifier.beautify(word, string -> string.toUpperCase());
        poemBeautifier.beautify(word, string -> "ABC" + string + "ABC");
        poemBeautifier.beautify(word, string -> string + "ma " + string.length() + " liter");
        poemBeautifier.beautify(word, string -> string + string + string + string);
    }
}