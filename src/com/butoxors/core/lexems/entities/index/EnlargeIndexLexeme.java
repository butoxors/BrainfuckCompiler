package com.butoxors.core.lexems.entities.index;

import com.butoxors.core.lexems.entities.ALexem;

public class EnlargeIndexLexeme extends ALexem {
    @Override
    public void run() {
        if (++index > arr.length)
            throw new ArrayIndexOutOfBoundsException("Index is greater than arr.length=" + arr.length + "...");
    }
}
