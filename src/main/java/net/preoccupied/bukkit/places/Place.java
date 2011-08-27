package net.preoccupied.bukkit.places;


import com.avaje.ebean.validation.NotNull;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Player;

import net.preoccupied.bukkit.permissions.PermissionCheck;



@Entity()
@Table(name="net_preoccupied_bukkit_place")
public class Place {

    @Id
    private int id;

    private String name = null;
    private String title = null;

    private boolean home = false;

    private int weight = 0;

    @Transient
    private PermissionCheck permissionCheck = null;
    
    private String spot_w = null;
    private int spot_x = 0;
    private int spot_y = 0;
    private int spot_z = 0;
    private float spotYaw = 0.0f;

    private String entrance_w = null;
    private int entrance_x = 0;
    private int entrance_y = 0;
    private int entrance_z = 0;
    private float entranceYaw = 0.0f;

    private String graveyard_w = null;
    private int graveyard_x = 0;
    private int graveyard_y = 0;
    private int graveyard_z = 0;
    private float graveyardYaw = 0.0f;


    public void setId(int id) {
	this.id = id;
    }


    public int getId() {
	return this.id;
    }


    public void setName(String name) {
	this.name = name;
    }

    
    public String getName() {
	return this.name;
    }


    public void setTitle(String title) {
	this.title = title;
    }


    public String getTitle() {
	return this.title;
    }


    public void setHome(boolean ishome) {
	this.home = ishome;
    }


    public boolean isHome() {
	return this.home;
    }


    public void setWeight(int weight) {
	this.weight = weight;
    }


    public int getWeight() {
	return this.weight;
    }


    public void setSpot(Location l) {
	if(l != null) {
	    setSpot_w(l.getWorld().getName());
	    setSpot_x(l.getBlockX());
	    setSpot_y(l.getBlockY());
	    setSpot_z(l.getBlockZ());
	    setSpotYaw(l.getYaw());

	} else {
	    setSpot_w(null);
	    setSpot_x(0);
	    setSpot_y(0);
	    setSpot_z(0);
	}
    }


    public Location getSpot() {
	return asLocation(spot_w, spot_x, spot_y, spot_z, spotYaw);
    }


    public String getWorld() {
	return getSpot_w();
    }


    public void setEntrance(Location l) {
	if(l != null) {
	    setEntrance_w(l.getWorld().getName());
	    setEntrance_x(l.getBlockX());
	    setEntrance_y(l.getBlockY());
	    setEntrance_z(l.getBlockZ());
	    setEntranceYaw(l.getYaw());

	} else {
	    setEntrance_w(null);
	    setEntrance_x(0);
	    setEntrance_y(0);
	    setEntrance_z(0);
	}
    }


    public Location getEntrance() {
	return asLocation(entrance_w, entrance_x, entrance_y, entrance_z, entranceYaw);
    }


    public void setGraveyard(Location l) {
	if(l != null) {
	    setGraveyard_w(l.getWorld().getName());
	    setGraveyard_x(l.getBlockX());
	    setGraveyard_y(l.getBlockY());
	    setGraveyard_z(l.getBlockZ());
	    setGraveyardYaw(l.getYaw());

	} else {
	    setGraveyard_w(null);
	    setGraveyard_x(0);
	    setGraveyard_y(0);
	    setGraveyard_z(0);
	}
    }


    public Location getGraveyard() {
	return asLocation(graveyard_w, graveyard_x, graveyard_y, graveyard_z, graveyardYaw);
    }


    public void setSpot_w(String w) {
	this.spot_w = w;
    }


    public String getSpot_w() {
	return spot_w;
    }


    public void setSpot_x(int i) {
	this.spot_x = i;
    }

    
    public int getSpot_x() {
	return this.spot_x;
    }


    public void setSpot_y(int i) {
	this.spot_y = i;
    }

    
    public int getSpot_y() {
	return this.spot_y;
    }


    public void setSpot_z(int i) {
	this.spot_z = i;
    }

    
    public int getSpot_z() {
	return this.spot_z;
    }


    public void setSpotYaw(float yaw) {
	this.spotYaw = yaw;
    }


    public float getSpotYaw() {
	return this.spotYaw;
    }


    public void setEntrance_w(String w) {
	this.entrance_w = w;
    }


    public String getEntrance_w() {
	return entrance_w;
    }


    public void setEntrance_x(int i) {
	this.entrance_x = i;
    }

    
    public int getEntrance_x() {
	return this.entrance_x;
    }


    public void setEntrance_y(int i) {
	this.entrance_y = i;
    }

    
    public int getEntrance_y() {
	return this.entrance_y;
    }


    public void setEntrance_z(int i) {
	this.entrance_z = i;
    }

    
    public int getEntrance_z() {
	return this.entrance_z;
    }


    public void setEntranceYaw(float yaw) {
	this.entranceYaw = yaw;
    }


    public float getEntranceYaw() {
	return this.entranceYaw;
    }


    public void setGraveyard_w(String w) {
	this.graveyard_w = w;
    }


    public String getGraveyard_w() {
	return graveyard_w;
    }


    public void setGraveyard_x(int i) {
	this.graveyard_x = i;
    }

    
    public int getGraveyard_x() {
	return this.graveyard_x;
    }


    public void setGraveyard_y(int i) {
	this.graveyard_y = i;
    }

    
    public int getGraveyard_y() {
	return this.graveyard_y;
    }


    public void setGraveyard_z(int i) {
	this.graveyard_z = i;
    }

    
    public int getGraveyard_z() {
	return this.graveyard_z;
    }


    public void setGraveyardYaw(float yaw) {
	this.graveyardYaw = yaw;
    }


    public float getGraveyardYaw() {
	return this.graveyardYaw;
    }


    private static Location asLocation(String w, int x, int y, int z) {
	if (w == null) return null;

	World world = Bukkit.getServer().getWorld(w);
	if (world == null) return null;

	return new Location(world, (double) x + 0.5d, (double) y, (double) z + 0.5d);
    }



    private static Location asLocation(String w, int x, int y, int z, float yaw) {
	Location l = asLocation(w, x, y, z);
	if(l != null) l.setYaw(yaw);
	return l;
    }


}


/* The end. */
