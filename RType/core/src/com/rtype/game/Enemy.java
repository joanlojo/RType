package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;

/**
 * Created by sobre on 21/12/2017.
 */

public abstract class Enemy extends GameObject {
    MathUtils math;
    private int i = 0;
    public abstract void act(float delta);
    public void Spawn(){
        if(i > 170) {
            setPosition(700, math.random(0, Gdx.graphics.getHeight()));
            i = 0;
        }
        i+=1;
    }
}
