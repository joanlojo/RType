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
    //Sprite spriteB;
    //Image bullet;
    private float velocityB, velocityP;
    private Vector2 lastTouch = new Vector2();
    public Player(Texture texture){
        this.texture = texture;
       // this.spriteB =spriteB;
        setTouchable(Touchable.enabled);
        this.velocityB = 80;
        this.velocityP = 150;
    }
    //public Image bullet = new Image(spriteB);
    public void act(float delta){
        //bullet.setX(bullet.getX() + this.velocityB * delta);
    }
    public void goUp(float delta){
            setY(getY() - 150*delta);
            if(getY() <= 70) {
                setY(70);
            }
        }
    public void goDown(float delta){
        setY(getY() +150*delta);
        if(getY() >=500){
            setY(500);
        }
    }

    public void spawnBullet(){
       /* bullet = new Image(spriteB);
        getStage().addActor(bullet);
        bullet.setPosition(this.getX()+ this.texture.getWidth()/2, this.getY()-50);*/
    }

}
