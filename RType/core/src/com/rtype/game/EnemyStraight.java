package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Gdx2DPixmap;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 21/12/2017.
 */

public class EnemyStraight extends Enemy {
    int i;

    public EnemyStraight(Texture texture){
        this.texture = texture;
        i = 0;
        //this.stage = stage;
        this.velocityX = -100;
        boundsE = new Rectangle(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
    }
    public void act(float delta){
        movment(delta);
        this.boundsE.set(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
    }
    public void movment(float delta){
        setX(getX() + this.velocityX*delta);
    }
}
