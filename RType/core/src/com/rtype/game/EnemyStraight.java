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
    private int velocity;
    public EnemyStraight(Texture texture){
        this.texture = texture;
        velocity = -110;
    }

    public void act(float delta){
        Spawn();
        movment(delta);
    }
    public void movment(float delta){
        setX(getX() + velocity * delta);
    }
}
