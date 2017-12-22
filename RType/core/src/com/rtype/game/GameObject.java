package com.rtype.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by jlopez on 12/20/2017.
 */

public class GameObject extends Actor {
    public Sprite sprite;

   // public GameObject(Sprite _sprite){
     //   sprite = _sprite;
    //}

    public void Draw(Batch batch, float parentAlpha){
        //implementarlo
        //batch.draw(sprite, getX(), getY());//nose si faltan parametros
        sprite.draw(batch);
        //sprite.scale(0.5f);
    }
}
