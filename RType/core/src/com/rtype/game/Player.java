package com.rtype.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by sobre on 19/12/2017.
 */

public class Player extends Actor {
    Sprite pj;
    Texture img;

    public void loadImage(){
        img = new Texture("Nave.png");
        pj = new Sprite(img);
    }
    public void goUp(){

    }
    public void goDown(){

    }
}
