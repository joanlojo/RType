package com.rtype.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class RTypeGame extends Game {
	private Stage stage;
	private Texture texturePJ, textureES, textureEZ, textureB;
  	private Player player;
	private EnemyStraight enemyStraight;
	private EnemyZigzag enemyZigzag;
	private Bullet bullet;
	private InputProcesador inputProcesador;
	private AssetsManager assetsManager;
	private EnemyManager enemyManager;

	@Override
	public void create () {
		stage = new Stage();
		assetsManager = new AssetsManager();
		enemyManager = new EnemyManager(assetsManager, stage);

		player = new Player(assetsManager.player);
		enemyStraight = new EnemyStraight(assetsManager.enemyStraight, stage);
		enemyZigzag = new EnemyZigzag(assetsManager.enemyZigZag, stage);
		bullet = new Bullet(assetsManager.bullet, player);

		stage.addActor(player);
		player.scaleBy(0.001f);
		player.setPosition(10,Gdx.graphics.getHeight()/2 + assetsManager.player.getHeight()/2);
		player.setRotation(-90);

		stage.addActor(enemyZigzag);
		enemyZigzag.setRotation(90);
		enemyZigzag.scaleBy(0.001f);

		stage.addActor(enemyStraight);
		enemyStraight.setRotation(90);
		enemyStraight.scaleBy(0.001f);
		stage.addActor(enemyManager);

		inputProcesador = new InputProcesador(stage, player, bullet);
		Gdx.input.setInputProcessor(inputProcesador);
	}

	@Override
	public void render () {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();
		stage.draw();
		stage.act(Gdx.graphics.getDeltaTime()); //de esta menera se llama a las funciones act y draw de todas las clases que heredan de acto


	}
	
	@Override
	public void dispose () {
		super.dispose();
		assetsManager.player.dispose();
		assetsManager.bullet.dispose();
		assetsManager.enemyStraight.dispose();
        assetsManager.enemyZigZag.dispose();
		stage.dispose();

	}
}
