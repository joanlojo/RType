package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by sobre on 21/12/2017.
 */

public abstract class Enemy extends GameObject {
    MathUtils math;
    public int velocityY, velocityX;
    public Rectangle bounds;
    AssetsManager assetsManager = new AssetsManager();
    public abstract void act(float delta);
}
