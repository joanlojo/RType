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
	private Sprite spriteP = new Sprite();
	private Texture texturePJ, textureES, textureEZ;
  	private Player player;
	private EnemyStraight enemyStraight;
	private EnemyZigzag enemyZigzag;

	@Override
	public void create () {
		stage = new Stage();
		texturePJ = new Texture("pj.png");
		textureES = new Texture("enemyStright.png");
		textureEZ = new Texture("enemyZigZag.png");
		player = new Player(texturePJ);
		enemyStraight = new EnemyStraight(textureES);
		enemyZigzag = new EnemyZigzag(textureEZ);

		stage.addActor(player);
		player.setPosition(0,Gdx.graphics.getHeight()/2);
		player.scaleBy(0.001f);

		stage.addActor(enemyZigzag);
		enemyZigzag.setPosition(500 - enemyZigzag.getWidth(),300);
		enemyZigzag.scaleBy(0.001f);
		//enemyZigzag.rotateBy(180);

		stage.addActor(enemyStraight);
		enemyStraight.setPosition(500,100);
		enemyStraight.scaleBy(0.001f);
		enemyStraight.rotateBy(180);

	}

	@Override
	public void render () {
		super.render();
		//Gdx.gl.glClearColor(0, 0, 0, 1);
		//Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime()); //de esta menera se llama a las funciones act y draw de todas las clases que heredan de acto
		stage.draw();

	}
	
	@Override
	public void dispose () {
		super.dispose();
		stage.dispose();
		texturePJ.dispose();
		textureES.dispose();
		textureEZ.dispose();
	}
}
