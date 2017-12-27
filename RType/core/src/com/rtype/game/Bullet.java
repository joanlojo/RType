package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 25/12/2017.
 */

/*public class Bullet extends Actor implements InputProcessor {
    //Player p;
    public Texture  textureB;
    public boolean shot;
    private Vector2 lastTouch = new Vector2();
    int velocity;
    //public static Bullet b = new Bullet(textureB);
    public Bullet(Texture texture){
        this.textureB = texture;
        this.velocity = 60;
        Group group = new Group();
        group.addActor(this);
        Gdx.input.setInputProcessor(this);

    }

    public void draw(Batch batch, float parentAlpha){
        //if(shot) {
            batch.draw(textureB, getX(), getY(), 0, 0, textureB.getWidth(), textureB.getHeight(), getScaleX(),
                    getScaleY(), getRotation(), 0, 0, textureB.getWidth(), textureB.getHeight(), true, false);
        //}
    }
    public void act(float delta){

        //pillar la posicion del player
        //System.out.println(shot);
        //setX(getX() + velocity*delta);
    }
    public void Spawn(){
        //pillar posicion player
        System.out.println("shot");
        //shot = true;
//        getStage().addActor(b);
         setPosition(300,300);
        //b.setPosition(50,150);
        //shot = false;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        lastTouch.set(screenX, screenY);
        if(button == Input.Buttons.RIGHT){
            //bullet.b.Spawn();
            //bullet.getY();
            System.out.println("shot");
            return true;
        }
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}*/
