package com.butoxors.core.lexems.entities.loop;

import com.butoxors.core.lexems.ILexem;
import com.butoxors.core.lexems.entities.ALexem;

public class EndWhileLexeme extends ALexem implements ILexem {
    @Override
    public void run() {
        if (arr[startLoopIndex] > 0)
            --arr[startLoopIndex];
    }
}
