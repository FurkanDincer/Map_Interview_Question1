

import java.util.Arrays;
import java.util.HashMap;

public class Maps01_INTERVIEW {
    public static void main(String[] args) {
        //Size verilen bir cümledeki her kelimenin kaç kere kullanıldığını gösteren kodu yazınız
        //"I like to move it, move it."==> I=1, like=1 move=2, it=2

        String str="I like to move it, move it.";

        //noktalama işaretlerini sil
        str=str.replaceAll("\\p{Punct}","");

        //kelimeleri almak için split kullanalım
        String[] kelimeler=str.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[I, like, to, move, it, move, it]

        HashMap<String,Integer> gorunum=new HashMap<>();

        for (String w: kelimeler){
            Integer gorunumSayısı=gorunum.get(w);
            if (gorunumSayısı==null) {
                gorunum.put(w,1);

            }else {
                gorunum.put(w,gorunumSayısı+1);
            }

        }

        System.out.println(gorunum);//{move=2, like=1, I=1, to=1, it=2}
    }
}
