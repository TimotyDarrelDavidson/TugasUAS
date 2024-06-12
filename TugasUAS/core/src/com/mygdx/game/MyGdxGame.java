package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.PerspectiveCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;

public class MyGdxGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private StretchViewport stretchViewport;
	private Camera camera;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		camera = new PerspectiveCamera();
		img = new Texture("badlogic.jpg");
		stretchViewport = new StretchViewport(800,800,camera);
	}

	@Override
	public void resize(int width, int height) {
		stretchViewport.update(width, height);
	}

	@Override
	public void render () {
		ScreenUtils.clear(0,0,0,0);
		
		stretchViewport.apply();
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
