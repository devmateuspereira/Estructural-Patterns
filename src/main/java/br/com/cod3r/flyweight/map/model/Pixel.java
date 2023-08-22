package br.com.cod3r.flyweight.map.model;

public class Pixel {

    private PixelType type;

    private boolean opened;

    public Pixel(PixelType type, boolean opened) {
        this.type = type;
        this.opened = opened;
    }

    public PixelType getType() {
        return type;
    }

    public void setType(PixelType type) {
        this.type = type;
    }

    public boolean isOpened() {
        return opened;
    }

    public void setOpened(boolean opened) {
        this.opened = opened;
    }

}