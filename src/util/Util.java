package util;

import java.util.HashMap;
import java.util.Map;

public class Util {
    static Map<CardType,String> nameMap=new HashMap<>(){
        {
            put(CardType.north,"北风");
            put(CardType.south,"南风");
            put(CardType.west,"西风");
            put(CardType.east,"东风");
            put(CardType.suo1,"一索");
            put(CardType.suo2,"二索");
            put(CardType.suo3,"三索");
            put(CardType.suo4,"四索");
            put(CardType.suo5,"五索");
            put(CardType.suo6,"六索");
            put(CardType.suo7,"七索");
            put(CardType.suo8,"八索");
            put(CardType.suo9,"九索");
            put(CardType.tong1,"一筒");
            put(CardType.tong2,"二筒");
            put(CardType.tong3,"三筒");
            put(CardType.tong4,"四筒");
            put(CardType.tong5,"五筒");
            put(CardType.tong6,"六筒");
            put(CardType.tong7,"七筒");
            put(CardType.tong8,"八筒");
            put(CardType.tong9,"九筒");
            put(CardType.wan1,"一万");
            put(CardType.wan2,"二万");
            put(CardType.wan3,"三万");
            put(CardType.wan4,"四万");
            put(CardType.wan5,"五万");
            put(CardType.wan6,"六万");
            put(CardType.wan7,"七万");
            put(CardType.wan8,"八万");
            put(CardType.wan9,"九万");
            put(CardType.zhong,"红中");
            put(CardType.fa,"发财");
            put(CardType.bai,"白板");
        }
    };

    public boolean isHu() {
        return true;
    }

    public boolean isChi() {
        return true;
    }
}
