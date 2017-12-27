package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 25/12/2017.
 */

public class Bullet extends Actor {
    //Player p;
    public static Texture  textureB;
    public boolean shot;
    int velocity;
    public static Bullet b = new Bullet(textureB);
    public Bullet(Texture texture){
        this.textureB = texture;
        this.velocity = 60;

    }

    public void draw(Batch batch, float parentAlpha){
        //if(shot) {
            batch.draw(textureB, getX(), getY(), 0, 0, textureB.getWidth(), textureB.getHeight(), getScaleX(),
                    getScaleY(), getRotation(), 0, 0, textureB.getWidth(), textureB.getHeight(), true, false);
        //}
    }
    public void act(float delta){

        //pillar la posicion del player
        //System.out.println(shot);
        //setX(getX() + velocity*delta);
    }
    public void Spawn(){
        //pillar posicion player
        System.out.println("shot");
        //shot = true;
//        getStage().addActor(b);
         setPosition(300,300);
        //b.setPosition(50,150);
        //shot = false;
    }
}
