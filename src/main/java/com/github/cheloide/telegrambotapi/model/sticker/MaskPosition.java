package com.github.cheloide.telegrambotapi.model.sticker;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This object describes the position on faces where a mask should be placed by
 * default.
 * 
 * @author Marcelo González
 *
 */
public class MaskPosition {
    /**
     * The part of the face relative to which the mask should be placed. One of
     * “forehead”, “eyes”, “mouth”, or “chin”.
     */
    @JsonProperty("point")
    private String point;
    /**
     * number Shift by X-axis measured in widths of the mask scaled to the face
     * size, from left to right. For example, choosing -1.0 will place mask just to
     * the left of the default mask position.
     */
    @JsonProperty("x_shift")
    private Float  xShift;
    /**
     * number Shift by Y-axis measured in heights of the mask scaled to the face
     * size, from top to bottom. For example, 1.0 will place the mask just below the
     * default mask position.
     */
    @JsonProperty("y_shift")
    private Float  yShift;
    /**
     * number Mask scaling coefficient. For example, 2.0 means double size.
     */
    @JsonProperty("scale")
    private Float  scale;

    /**
     * @return the point
     */
    public String getPoint() {
        return point;
    }

    /**
     * @return the scale
     */
    public Float getScale() {
        return scale;
    }

    /**
     * @return the xShift
     */
    public Float getxShift() {
        return xShift;
    }

    /**
     * @return the yShift
     */
    public Float getyShift() {
        return yShift;
    }

    /**
     * @param point the point to set
     */
    public void setPoint(String point) {
        this.point = point;
    }

    /**
     * @param scale the scale to set
     */
    public void setScale(Float scale) {
        this.scale = scale;
    }

    /**
     * @param xShift the xShift to set
     */
    public void setxShift(Float xShift) {
        this.xShift = xShift;
    }

    /**
     * @param yShift the yShift to set
     */
    public void setyShift(Float yShift) {
        this.yShift = yShift;
    }
}
