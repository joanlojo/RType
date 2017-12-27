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
    //public static Player p = new Player(texture);
    //private InputProcesador inputProcesador;
    public Player(){}
    public Player(Texture texture){
        this.texture = texture;
        //inputProcesador = new InputProcesador(this);
        //Gdx.input.setInputProcessor(inputProcesador);
    }

    public void act(float delta){
        //System.out.println(Y());
    }
    public float X(){
        return this.getX();
    }
    public float Y(){
        return this.getY();
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
