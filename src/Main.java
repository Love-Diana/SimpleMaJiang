import util.Card;
import util.CardType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static List<Card> allCards=new ArrayList<>();
    static List<Card> player1 =new ArrayList<>();
    static List<Card> player2 =new ArrayList<>();
    static List<Card> player3 =new ArrayList<>();
    static List<Card> player4 =new ArrayList<>();
    static List<Card> outside1 =new ArrayList<>();
    static List<Card> outside2 =new ArrayList<>();
    static List<Card> outside3 =new ArrayList<>();
    static List<Card> outside4 =new ArrayList<>();

    static boolean ifAllCardEmpty=false;

    static private void setup() {
        System.out.println("game start!");
        for(CardType a: CardType.values()){
            for (int i=0;i<4;i++) {
                allCards.add(new Card(a));
            }
        }
        Collections.shuffle(allCards);
        System.out.println("牌堆为 "+allCards);
        for (int i=0;i<13;i++) {
            draw(player1);
            draw(player2);
            draw(player3);
            draw(player4);
        }
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(player4);
        System.out.println("玩家1 "+player1);
        System.out.println("玩家2 "+player2);
        System.out.println("玩家3 "+player3);
        System.out.println("玩家4 "+player4);
        System.out.println("牌堆为 "+allCards);

    }

    static private void draw(List<Card> player) {
        if (allCards.isEmpty()) {
            System.out.println("平局！");
            ifAllCardEmpty=true;
            return;
        }
        player.add(allCards.get(0));
        allCards.remove(0);
    }

    static private void play(List<Card> player) {
        player.remove(0);
    }

    static private void drawEndCard(List<Card> player) {
        if (allCards.isEmpty()) {
            System.out.println("平局！");
            return;
        }
        player.add(allCards.get(allCards.size()-1));
        allCards.remove(allCards.size()-1);
    }


    public static void main(String[] args) {
        setup();
        int index=0;
        while (true) {
            draw(player1);
            if (ifAllCardEmpty) {
                break;
            }
            play(player1);

            draw(player2);
            if (ifAllCardEmpty) {
                break;
            }
            play(player2);

            draw(player3);
            if (ifAllCardEmpty) {
                break;
            }
            play(player3);

            draw(player4);
            if (ifAllCardEmpty) {
                break;
            }
            play(player4);

            System.out.println(" ");
            System.out.println("index= "+index);
            System.out.println("玩家1 "+player1);
            System.out.println("玩家2 "+player2);
            System.out.println("玩家3 "+player3);
            System.out.println("玩家4 "+player4);
            System.out.println("牌堆为 "+allCards);
            index++;
        }
    }
}
