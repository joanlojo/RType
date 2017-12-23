package com.rtype.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

/**
 * Created by sobre on 21/12/2017.
 */

public class EnemyZigzag extends Enemy {

    public EnemyZigzag(Texture texture){
        this.texture = texture;
    }

    public void act(float delta){
        Spawn();
    }
}
