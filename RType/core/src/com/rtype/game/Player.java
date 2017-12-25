package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.scenes.scene2d.Actor;

/**
 * Created by sobre on 19/12/2017.
 */

public class Player extends GameObject {
    //GameObject gameObject;
    private InputProcesador inputProcesador;

    public Player(Texture texture){
        this.texture = texture;
        inputProcesador = new InputProcesador(this);
        Gdx.input.setInputProcessor(inputProcesador);
    }
    public void act(float delta){
    }
    public void goUp(float delta){
        setY(getY() - 110*delta);
        if(getY() <= 70) {
            setY(70);
        }
    }
    public void goDown(float delta){
        setY(getY() +110*delta);
        if(getY() >=500){
            setY(500);
        }
    }
}
