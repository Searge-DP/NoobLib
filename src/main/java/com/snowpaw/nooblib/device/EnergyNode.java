package com.snowpaw.nooblib.device;

public class EnergyNode {
	
    public int x;
    public int y;
    public int z;
    public boolean master;

    public EnergyNode(int x, int y, int z, boolean master) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.master = master;
    }

    public EnergyNode(int x, int y, int z, int master) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.master = master == 1;
    }

    public int getMasterAsInt() {
        if (master)
            return 1;
        else
            return 0;
    }

}
