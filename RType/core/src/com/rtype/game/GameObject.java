package com.rtype.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jlopez on 12/20/2017.
 */

public class GameObject extends Actor {
    public Texture texture;

    public void draw(Batch batch, float parentAlpha){
        batch.draw(texture, getX(), getY(), 0,0, texture.getWidth(),texture.getHeight(), getScaleX(),
        getScaleY(), getRotation(), 0,0,texture.getWidth(), texture.getHeight(),true, false);
    }
}
