package com.butoxors.core.composite;

import com.butoxors.core.lexems.ILexem;
import com.butoxors.core.lexems.entities.ALexem;
import com.butoxors.core.lexems.entities.loop.StartWhileLexeme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LexemeCollector extends ALexem implements ILexem {
    private List<ILexem> coll = new ArrayList<>();

    public void addLexems(ILexem... lexems) {
        coll.addAll(Arrays.asList(lexems));
    }

    @Override
    public void run() {
        for (int i = 0; i < coll.size(); i++) {
            if (coll.get(i) instanceof StartWhileLexeme) {
                while (arr[startLoopIndex] != Character.MIN_VALUE) {
                    for (int j = i; j < coll.size(); j++) {
                        coll.get(j).run();
                    }
                }
            }
            coll.get(i).run();
        }
    }
}
