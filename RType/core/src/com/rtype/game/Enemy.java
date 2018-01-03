package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 21/12/2017.
 */

public abstract class Enemy extends GameObject {
    public int velocityY, velocityX;
    public Stage stage;
    public Rectangle boundsE;
    public abstract void act(float delta);

}
