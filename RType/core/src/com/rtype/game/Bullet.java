package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 25/12/2017.
 */

public class Bullet extends GameObject  {
    Vector2 posbBullet;
    Rectangle boundsB;
    Player player;
    int velocity;
    public Bullet(Texture texture, Player p){
        this.texture = texture;
        this.velocity = 100;
        player = p;
        posbBullet = new Vector2();
        boundsB = new Rectangle(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
    }
    public void act(float delta){
        this.boundsB.set(this.getX(), this.getY(), (float)this.texture.getWidth(), (float)this.texture.getHeight());
        setX(getX() + velocity*delta);
    }
    public void Spawn(){
        setPosition(player.getX() + player.texture.getWidth()/2,player.getY()-50);
    }
}
