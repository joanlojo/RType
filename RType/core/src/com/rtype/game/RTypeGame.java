package com.rtype.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RTypeGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	Sprite prota;
	private InputProcesador inputproc;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
		prota = new Sprite(img);
        prota.setCenter(0,0);
        prota.setRotation(45);
		prota.setPosition(Gdx.graphics.getWidth()/2 - prota.getWidth()/2,Gdx.graphics.getHeight()/2-prota.getHeight()/2);
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		//batch.draw(img, 0, 0);
		prota.draw(batch);
		batch.end();

        inputUser();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
	public void inputUser(){
    }
}
