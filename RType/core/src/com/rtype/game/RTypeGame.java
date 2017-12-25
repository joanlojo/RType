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
		player.scaleBy(0.001f);
		player.setPosition(10,Gdx.graphics.getHeight()/2 + texturePJ.getHeight()/2);
		player.setRotation(-90);

		stage.addActor(enemyZigzag);
		enemyZigzag.setRotation(90);
		enemyZigzag.scaleBy(0.001f);

		stage.addActor(enemyStraight);
		enemyStraight.setRotation(90);
		enemyStraight.scaleBy(0.001f);


	}

	@Override
	public void render () {
		super.render();
		stage.draw();
		stage.act(Gdx.graphics.getDeltaTime()); //de esta menera se llama a las funciones act y draw de todas las clases que heredan de acto


	}
	
	@Override
	public void dispose () {
		super.dispose();
		texturePJ.dispose();
		textureES.dispose();
		textureEZ.dispose();
		stage.dispose();

	}
}
