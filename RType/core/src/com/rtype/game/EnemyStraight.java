package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by sobre on 21/12/2017.
 */

public class EnemyStraight extends Enemy {
    Vector2 posES;
    int i = 0;
    public EnemyStraight(Texture texture){
        this.texture = texture;
        this.velocityX = -100;
        posES = new Vector2();
        bounds = new Rectangle(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
    }
    public void act(float delta){
        EnemyStraight enemyStraight;
        if(i > 50) {
            enemyStraight = new EnemyStraight(assetsManager.enemyStraight);
            enemyStraight.setPosition(700, math.random(0, Gdx.graphics.getHeight()));
            i = 0;
        }
        i+=1;

        setX(getX() + this.velocityX*delta);

    }
    public void movment(float delta){

    }
    public void Spawn(){

    }
}
