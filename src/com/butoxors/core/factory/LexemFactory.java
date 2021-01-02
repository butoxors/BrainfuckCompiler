package com.butoxors.core.factory;

import com.butoxors.core.lexems.*;
import com.butoxors.core.lexems.entities.index.EnlargeIndexLexeme;
import com.butoxors.core.lexems.entities.index.ReduceIndexLexeme;
import com.butoxors.core.lexems.entities.io.InputLexeme;
import com.butoxors.core.lexems.entities.io.OutputLexeme;
import com.butoxors.core.lexems.entities.loop.EndWhileLexeme;
import com.butoxors.core.lexems.entities.loop.StartWhileLexeme;
import com.butoxors.core.lexems.entities.value.EnlargeValueLexeme;
import com.butoxors.core.lexems.entities.value.ReduceValueLexeme;

import java.util.HashMap;

public final class LexemFactory {
    private static HashMap<Character, ILexem> types = new HashMap<>();

    static {
        prepareTypes();
    }

    public static ILexem createLexeme(char l) {
        if (types.containsKey(l))
            return types.get(l);

        throw new IllegalArgumentException("Key[" + l + "] does not exist...");
    }

    private static void prepareTypes() {
        types.put('>', new EnlargeIndexLexeme());
        types.put('<', new ReduceIndexLexeme());
        types.put('+', new EnlargeValueLexeme());
        types.put('-', new ReduceValueLexeme());
        types.put('.', new OutputLexeme());
        types.put(',', new InputLexeme());
        types.put('[', new StartWhileLexeme());
        types.put(']', new EndWhileLexeme());
    }
}
