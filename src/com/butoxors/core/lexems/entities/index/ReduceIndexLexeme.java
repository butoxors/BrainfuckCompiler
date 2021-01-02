package com.butoxors.core.lexems.entities.index;

import com.butoxors.core.lexems.entities.ALexem;

public class ReduceIndexLexeme extends ALexem {
    @Override
    public void run() {
        if (--index < 0)
            throw new ArrayIndexOutOfBoundsException("Index: [" + index + "] is less than 0...");
    }
}
