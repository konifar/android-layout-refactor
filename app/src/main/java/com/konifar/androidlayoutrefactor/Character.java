package com.konifar.androidlayoutrefactor;

import java.util.ArrayList;
import java.util.List;

public final class Character {

    private final String name;
    private final int drawableResId;
    private final String phrase;

    public Character(final String name, final int drawableResId, final String phrase) {
        this.name = name;
        this.drawableResId = drawableResId;
        this.phrase = phrase;
    }

    public static List<Character> createSamples() {
        List<Character> characters = new ArrayList<>();
        characters.add(new Character("宮森あおい", R.drawable.miyamori, "現場は生き物って言うからね。何時も何かが起きる。だから、今出来ることをやっておかないとね！"));
        characters.add(new Character("安原絵麻", R.drawable.ema, "綺麗ごとかもしれないけど、熱意とかやる気とか努力とか、絶対映像に表れると思う。"));
        characters.add(new Character("坂木しずか", R.drawable.shizuka, "いいなぁ。仕事の事で悩めるなんて、ちゃんと仕事してるって事だもん。"));
        characters.add(new Character("藤堂美沙", R.drawable.misa, "どこに辿りつきたいのか・・・"));
        characters.add(new Character("今井みどり", R.drawable.midori, "何言ってんすか絵麻先輩！怖いのは、脚本家になれないことです！"));
        characters.add(new Character("ミムジー", R.drawable.mimuji, "まだ余裕だね。夢見る暇があるんだから。夢みたいなお話しを作るには、夢だけ見てちゃ作れないのさ。"));
        characters.add(new Character("ロロ", R.drawable.roro, "全部を一度には無理でもね、小さなことからコツコツやればいつか終わるよ。"));
        return characters;
    }

    public String getName() {
        return name;
    }

    public int getDrawableResId() {
        return drawableResId;
    }

    public String getPhrase() {
        return phrase;
    }

}
