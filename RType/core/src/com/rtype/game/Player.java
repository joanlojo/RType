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
    Image textureB;
    private float velocityB;
    private Vector2 lastTouch = new Vector2();
    public Player(Texture texture, Sprite textureB){
        this.texture = texture;
        this.textureB = new Image(textureB);
        setTouchable(Touchable.enabled);
        this.velocityB = 60;
        group.addActor(this);

    }

    public void act(float delta){
        textureB.setX(textureB.getX() + this.velocityB * delta);
    }
    public void goUp(float delta){
        //group = (Group)getStage().getActors().first();
        setY(getY() - 110*delta);
        if(getY() <= 70) {
            setY(70);
        }
    }
    public void goDown(float delta){
       // group = (Group)getStage().getActors().first();
        setY(getY() +110*delta);
        if(getY() >=500){
            setY(500);
        }
    }

    public void spawnBullet(){
        getStage().addActor(textureB);
        textureB.setPosition(this.getX(), this.getY());
        //Group group = (Group)getStage().getActors().first();
        //System.out.println(this.getX() + " " + this.getY());
    }

}
