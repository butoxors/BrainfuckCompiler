package com.butoxors.core.lexems.entities.loop;

import com.butoxors.core.lexems.ILexem;
import com.butoxors.core.lexems.entities.ALexem;

public class StartWhileLexeme extends ALexem implements ILexem {
    @Override
    public void run() {
        if (index == 0)
            startLoopIndex = 0;
        else
            startLoopIndex = index - 1;
    }
}
