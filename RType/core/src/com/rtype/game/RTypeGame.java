package com.rtype.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class RTypeGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img, nave;
	Sprite bg, pj;
	private InputProcesador inputproc;
	//MainCharacter pj;
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("cielo.jpg");
        nave = new Texture("Nave.png");
		pj = new Sprite(nave);
		pj.scale(0.001f);
		pj.setCenter(0,0f);
		pj.setPosition(0,Gdx.graphics.getHeight()/2 - pj.getHeight()/2);
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
		batch.draw(pj,0,0);
		bg.draw(batch);
		pj.draw(batch);
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
