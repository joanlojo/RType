package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by jlopez on 12/18/2017.
 */

public class InputProcesador extends InputAdapter {
    private Player personaje;
    private Bullet bullet;
    private Stage stage;
    private Vector2 lastTouch = new Vector2();
    private int delay = 100;

    public InputProcesador(Stage s, Player p, Bullet b){
        stage = s;
        personaje = p;
        bullet = b;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
//        bullet = (Bullet)stage.getActors().get(3);
        lastTouch.set(screenX, screenY);
        if(button == Input.Buttons.RIGHT){
            stage.addActor(bullet);
            bullet.Spawn();
            //personaje.spawnBullet();
            return true;
        }
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer){
        Vector2 newTouch = new Vector2(screenX, screenY);
        Vector2 delta = newTouch.cpy().sub(lastTouch);
        //personaje =  (Player)stage.getActors().first();
        lastTouch = newTouch;
        if(delta.y < 0){

            personaje.goUp(Gdx.graphics.getDeltaTime());
        }
        else{
            personaje.goDown(Gdx.graphics.getDeltaTime());
        }
        return true;
    }
}
