package com.butoxors.core.parser;

import com.butoxors.core.composite.LexemeCollector;
import com.butoxors.core.factory.LexemFactory;

public class LexemeParser {
    private static String cmd;
    private static LexemeCollector rootCollector = new LexemeCollector();

    public static LexemeCollector parse(String command) {
        cmd = command;

        for (int i = 0; i < cmd.length(); i++) {
            char l = cmd.toCharArray()[i];

            if (l == '[' && i + 1 < cmd.length()) {
                cmd = cmd.substring(i);
                rootCollector.addLexems(innerCollector());
                i = 0;
            } else
                rootCollector.addLexems(LexemFactory.createLexeme(l));
        }

        return rootCollector;
    }

    private static LexemeCollector innerCollector() {
        LexemeCollector leafCollector = new LexemeCollector();

        for (int i = 0; i < cmd.length(); i++) {
            char l = cmd.toCharArray()[i];
            leafCollector.addLexems(LexemFactory.createLexeme(l));

            if (l == '[' && i + 1 < cmd.length() && i != 0) {
                cmd = cmd.substring(i + 1);
                leafCollector.addLexems(innerCollector());
            }

            if (l == ']') {
                cmd = cmd.substring(i + 1);
                return leafCollector;
            }
        }

        return leafCollector;
    }
}
