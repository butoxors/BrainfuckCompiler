package com.butoxors;

import com.butoxors.core.composite.LexemeCollector;
import com.butoxors.core.parser.LexemeParser;

public class Main {

    public static void main(String[] args) {
        LexemeCollector collector = LexemeParser.parse("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.");
        collector.run();
    }
}
