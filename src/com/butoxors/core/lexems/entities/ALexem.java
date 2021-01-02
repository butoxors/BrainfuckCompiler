package com.butoxors.core.lexems.entities;

import com.butoxors.core.lexems.ILexem;

public abstract class ALexem implements ILexem {
    public static char[] arr = new char[30_000];
    public static int index = 0;
    protected static char memoryCell = Character.MIN_VALUE;
    protected static int startLoopIndex = 0;
}
