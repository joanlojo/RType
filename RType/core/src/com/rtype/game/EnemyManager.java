package com.rtype.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Created by sobre on 29/12/2017.
 */

public class EnemyManager extends Actor {
    private int i;
    MathUtils math;
    Stage stage;
    private AssetsManager assetsManager;
    EnemyStraight enemyStraight;
    EnemyZigzag enemyZigzag;

    public EnemyManager(AssetsManager assetsManager, Stage stage){
        i = 0;
        this.assetsManager = assetsManager;
        this.stage = stage;
    }

    public void act(float delta){
        if(i > 300) {
            enemyStraight = new EnemyStraight(assetsManager.enemyStraight, stage);
            enemyStraight.setPosition(700, math.random(0, Gdx.graphics.getHeight()));
            enemyStraight.setRotation(90);
            stage.addActor(enemyStraight);
            enemyZigzag = new EnemyZigzag(assetsManager.enemyZigZag, stage);
            enemyZigzag.setPosition(700, math.random(0, Gdx.graphics.getHeight()));
            enemyZigzag.setRotation(90);
            stage.addActor(enemyZigzag);
            i = 0;
        }
        i+=1;
    }
}
