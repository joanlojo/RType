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
    public Sprite sprite;
    public Texture texture;

   // public GameObject(Sprite _sprite){
     //   sprite = _sprite;
    //}
    public void draw(Batch batch, float parentAlpha){
        //implementarlo
        //batch.draw(sprite, getX(), getY());//nose si faltan parametros
        batch.draw(texture, getX(), getY(), 0,0, texture.getWidth(),texture.getHeight(), getScaleX(),
        getScaleY(), getRotation(), 0,0,texture.getWidth(), texture.getHeight(),false, false);
        //sprite.draw(batch);
        //sprite.scale(0.5f);
    }
}
