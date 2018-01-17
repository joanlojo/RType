package com.rtype.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class RTypeGame extends Game {
	private Stage stage;
  	private Player player;
	private EnemyStraight enemyStraight;
	private EnemyZigzag enemyZigzag;
	private EnemyNew enemyNew;
	private Bullet bullet;
	private InputManager inputManager;
	private AssetsManager assetsManager;
	private EnemyManager enemyManager;

	@Override
	public void create () {
		stage = new Stage();
		assetsManager = new AssetsManager();
		enemyManager = new EnemyManager(assetsManager, stage);

		player = new Player(assetsManager.player);
		enemyStraight = new EnemyStraight(assetsManager.enemyStraight);
		enemyZigzag = new EnemyZigzag(assetsManager.enemyZigZag);
		enemyNew = new EnemyNew(assetsManager.enemyNew);
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

		//stage.addActor(enemyNew);
		//enemyStraight.setRotation(90);
		//enemyStraight.scaleBy(0.001f);

		stage.addActor(enemyManager);

		inputManager = new InputManager(stage, player);
		Gdx.input.setInputProcessor(inputManager);
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
		assetsManager.enemyNew.dispose();
		stage.dispose();

	}
}
