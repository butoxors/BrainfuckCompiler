package com.butoxors.core.lexems.entities.io;

import com.butoxors.core.lexems.ILexem;
import com.butoxors.core.lexems.entities.ALexem;

public class OutputLexeme extends ALexem implements ILexem {

    @Override
    public void run() {
        memoryCell = arr[index];
        System.out.println("Output: " + (char)(arr[index] + 48));
    }
}
