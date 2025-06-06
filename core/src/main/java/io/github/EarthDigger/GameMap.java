package io.github.EarthDigger;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.maps.tiled.TiledMap;

public abstract class GameMap extends TiledMap {

    public abstract void render (OrthographicCamera camera);
    public abstract void update (float delta);
    public abstract void dispose ();

    public TileType getTileTypeByLocation(int layer, float x, float y){
        return this.getTileTypeByCoordinate(layer, (int)(x/TileType.TILE_SIZE), (int)(y/TileType.TILE_SIZE));
    }

    public abstract TileType getTileTypeByCoordinate(int layer, float x, float y);

    public abstract int getWidth();
    public abstract int getHeigth();
    public abstract int getLayer();

}
