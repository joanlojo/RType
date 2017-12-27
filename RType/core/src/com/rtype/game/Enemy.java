package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;

/**
 * Created by sobre on 21/12/2017.
 */

public abstract class Enemy extends GameObject {
    MathUtils math;
    private int i = 1001;
    public int velocityX, velocityY;
    public abstract void act(float delta);
    public void Spawn(){
        if(i > 1000) {
            //EnemyStraight enemyStraight = new EnemyStraight(texture);
            setPosition(700, math.random(0, Gdx.graphics.getHeight()));
            i = 0;
        }
        i+=1;
    }
}
