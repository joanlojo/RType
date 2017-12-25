package com.rtype.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by sobre on 25/12/2017.
 */

public class Bullet extends Actor {
    Player p;
    Texture texture;
    int velocity;
    public Bullet(Texture texture){
        this.texture = texture;
        this.velocity = 60;
    }

    public void draw(Batch batch, float parentAlpha){
        batch.draw(texture, getX(), getY(), 0,0, texture.getWidth(),texture.getHeight(), getScaleX(),
                getScaleY(), getRotation(), 0,0,texture.getWidth(), texture.getHeight(),true, false);
    }
    public void act(float delta){
        //pillar la posicion del player
       // setPosition(p.getX(), p.getY());
        //darle esta posicion
        //setX(getX() + this.velocity * delta);
        //Spawn();
    }
    public void Spawn(){
        System.out.println("shot");
    }
}
