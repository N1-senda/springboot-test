package com.springboot.test.chainofresponsibilitypattern;

/**
 * @author xumengsen
 * @Title: SpellCheckerProcessing
 * @Description: TODO
 * @date 2019/3/7
 */
public class SpellCheckerProcessing extends ProcessingObject<String> {

    @Override
    public String handleWork(String text) {
        return text.replaceAll("labda", "lambda");
    }

}
