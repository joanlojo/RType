package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;

/**
 * Created by sobre on 21/12/2017.
 */

public class EnemyStraight extends Enemy {
    int i = 0;
    public EnemyStraight(Texture texture){
        this.texture = texture;
        this.velocityX = -100;
    }

    public void act(float delta){
        Spawn();
        movment(delta);
    }
    public void movment(float delta){
        setX(getX() + this.velocityX*delta);
        //System.out.println(this.getX());
    }
    public void Spawn(){
       /* if(i > 50) {
            EnemyStraight enemyStraight = new EnemyStraight(this.texture);
            this.setPosition(700, math.random(0, Gdx.graphics.getHeight()));
            i = 0;
        }*/
        i+=1;
    }
}
