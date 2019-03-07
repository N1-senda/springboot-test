package com.springboot.test.chainofresponsibilitypattern;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * @author xumengsen
 * @Title: ChainOfResponsibilityPatternTest
 * @Description: TODO
 * @date 2019/3/7
 */
public class ChainOfResponsibilityPatternTest {

    @Test
    public void chainOfResponsibilityPatternTest1() {
        ProcessingObject<String> p1 = new HeaderTextProcessing();
        ProcessingObject<String> p2 = new SpellCheckerProcessing();
        p1.setSuccessor(p2);
        String result = p1.handle("Aren't labdas really sexy?!!");
        System.out.println(result);
    }

    @Test
    public void chainOfResponsibilityPatternTest2() {
        UnaryOperator<String> headerProcessing = (String text) -> "From Raoul, Mario and Alan: " + text;
        UnaryOperator<String> spellCheckerProcessing = (String text) -> text.replaceAll("labda", "lambda");
        Function<String, String> pipeline = headerProcessing.andThen(spellCheckerProcessing);
        String result = pipeline.apply("Aren't labdas really sexy?!!");
        System.out.println(result);
    }
}
