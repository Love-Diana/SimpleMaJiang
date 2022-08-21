package util;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class Card implements Comparable<Card> {
    public CardType type;
    public Card(CardType type) {
        this.type=type;
    }

    @Override
    public String toString (){
        return Util.nameMap.get(type);
    }


    @Override
    public int compareTo(@NotNull Card o) {
        return this.type.compareTo(o.type);
    }
}

