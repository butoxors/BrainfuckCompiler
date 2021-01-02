package com.butoxors.core.lexems.entities.value;

import com.butoxors.core.lexems.ILexem;
import com.butoxors.core.lexems.entities.ALexem;

public class EnlargeValueLexeme extends ALexem implements ILexem {
    @Override
    public void run() {
        ++arr[index];
    }
}
