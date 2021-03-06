package com.rtype.game;

/**
 * Created by sobre on 28/12/2017.
 */

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;

public class AssetsManager {
    public Texture enemyStraight = new Texture("enemyStright.png");
    public Texture enemyZigZag = new Texture("enemyZigZag.png");
    public Texture enemyNew = new Texture("nave3.png");
    public Texture player = new Texture("pj.png");
    public Texture bullet = new Texture("bullet.png");

    public Sound shot = Gdx.audio.newSound(Gdx.files.internal("shot.mp3"));
}