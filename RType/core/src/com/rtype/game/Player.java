package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

/**
 * Created by sobre on 19/12/2017.
 */

public class Player extends GameObject {
    Group group = new Group();
    private float velocityP;
    private Vector2 lastTouch = new Vector2();
    public Player(Texture texture){
        this.texture = texture;
        setTouchable(Touchable.enabled);
        this.velocityP = 150;
    }
    public void act(float delta){
    }
    public void goUp(float delta){
            setY(getY() - this.velocityP*delta);
            if(getY() <= 70) {
                setY(70);
            }
        }
    public void goDown(float delta){
        setY(getY() +this.velocityP*delta);
        if(getY() >=500){
            setY(500);
        }
    }
}
