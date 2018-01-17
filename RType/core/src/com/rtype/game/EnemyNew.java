package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by jlopez on 1/17/2018.
 */

public class EnemyNew extends Enemy{
    int i;

    public EnemyNew(Texture texture){
        this.texture = texture;
        i = 0;
        this.velocityX = -100;
        this.velocityY = 100;
    }
    public void act(float delta){
        movment(delta);
    }
    public void movment(float delta){
        setX(getX() + this.velocityX*delta);
        if(getX() <= Gdx.graphics.getWidth()/2){
            this.velocityX = 0;
            setY(getY() + this.velocityY * delta);
        }
        if(getY() >= 450){
            this.velocityY = -100;
        }
        if(getY() <= 0){
            this.velocityY = 100;
        }

    }
}