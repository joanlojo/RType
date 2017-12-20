package com.rtype.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class RTypeGame extends Game {
	private Stage stage;

    SpriteBatch batch;
	Texture img;
	Sprite bg;
	private InputProcesador inputproc;
	//Player pj;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("cielo.jpg");
		bg = new Sprite(img);
        bg.scale(0.7f);

		//inputproc = new InputProcesador(pj);
		//Gdx.input.setInputProcessor(inputproc);
	}

	@Override
	public void render () {
		//Gdx.gl.glClearColor(1, 0, 0, 1);
		//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		bg.draw(batch);
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
