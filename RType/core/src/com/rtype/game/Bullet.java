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

public class Bullet extends Actor  {
    Vector2 posbBullet;
    private Rectangle boundsB;
    Player player;
    public Texture textureB;
    int velocity;
    public Bullet(Texture texture, Player p){
        this.textureB = texture;
        this.velocity = 100;
        player = p;
        posbBullet = new Vector2();
        this.boundsB = new Rectangle(this.getX(), this.getY(), (float)this.textureB.getWidth(), (float)this.textureB.getHeight());
    }

    public void draw(Batch batch, float parentAlpha){
            batch.draw(textureB, getX(), getY(), 0, 0, textureB.getWidth(), textureB.getHeight(), getScaleX(),
                    getScaleY(), getRotation(), 0, 0, textureB.getWidth(), textureB.getHeight(), true, false);
    }
    public void act(float delta){
        setX(getX() + velocity*delta);
    }
    public void Spawn(){
        setPosition(player.getX() + player.texture.getWidth()/2,player.getY()-50);
    }
}
