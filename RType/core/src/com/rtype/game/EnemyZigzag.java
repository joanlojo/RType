package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 21/12/2017.
 */

public class EnemyZigzag extends Enemy {
    Vector2 posEZ;
    int i = 0;
    public EnemyZigzag(Texture texture){
        this.texture = texture;
        this.velocityX = -30;
        this.velocityY = -60;
        posEZ = new Vector2();
        this.stage = stage;
        boundsE = new Rectangle(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
    }
    public void act(float delta){
        movment(delta);
        this.boundsE.set(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
    }
    public void movment(float delta) {
        if(getY() <= 0) {this.velocityY = 60;}
        if(getY() >= 450){this.velocityY = -60;}
        setY(getY() + this.velocityY * delta);
        setX(getX() + this.velocityX * delta);
    }
}
