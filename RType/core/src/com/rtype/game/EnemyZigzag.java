package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by sobre on 21/12/2017.
 */

public class EnemyZigzag extends Enemy {

    public EnemyZigzag(Texture texture){
        this.texture = texture;
        this.velocityX = -30;
        this.velocityY = -60;
    }

    public void act(float delta){
        Spawn();
        movment(delta);
    }
    public void movment(float delta) {
        if(getY() <= 0) {this.velocityY = 60;}
        if(getY() >= 450){this.velocityY = -60;}
        setY(getY() + this.velocityY * delta);
        setX(getX() + this.velocityX * delta);

    }
}
