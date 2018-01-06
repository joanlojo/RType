package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Group;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by jlopez on 12/18/2017.
 */

public class InputManager extends InputAdapter {
    private Player player;
    private Stage stage;
    private Vector2 lastTouch = new Vector2();
    AssetsManager assetsManager = new AssetsManager();

    public InputManager(Stage s, Player p){
        stage = s;
        player = p;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button){
        lastTouch.set(screenX, screenY);
        if(button == Input.Buttons.RIGHT){
            Bullet bullet = new Bullet(assetsManager.bullet,player);
            stage.addActor(bullet);
            assetsManager.shot.play();
            bullet.Spawn();
            return true;
        }
        return true;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer){
        Vector2 newTouch = new Vector2(screenX, screenY);
        Vector2 delta = newTouch.cpy().sub(lastTouch);
        lastTouch = newTouch;
        if(delta.y < 0){
            player.goUp(Gdx.graphics.getDeltaTime());
        }
        else{
            player.goDown(Gdx.graphics.getDeltaTime());
        }
        return true;
    }
}
