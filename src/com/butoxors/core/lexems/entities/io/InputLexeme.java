package com.butoxors.core.lexems.entities.io;

import com.butoxors.core.lexems.ILexem;
import com.butoxors.core.lexems.entities.ALexem;

public class InputLexeme extends ALexem implements ILexem {
    @Override
    public void run() {
        arr[index] = memoryCell;
    }
}
