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
	private Sprite spriteP;
	private Texture texture;
  	private Player player;
	private EnemyStraight enemyStraight;

	@Override
	public void create () {
		stage = new Stage();
		texture = new Texture("Nave.png");
		spriteP = new Sprite(texture);
		//player = new Player(spriteP);
		enemyStraight = new EnemyStraight();

		stage.addActor(player);
		player.setPosition(100,100);
	}

	@Override
	public void render () {
		super.render();
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(); //de esta menera se llama a las funciones act y draw de todas las clases que heredan de actor
		stage.draw();
	}
	
	@Override
	public void dispose () {
		super.dispose();
		stage.dispose();
	}
}
