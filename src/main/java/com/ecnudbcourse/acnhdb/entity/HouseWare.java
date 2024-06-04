package com.ecnudbcourse.acnhdb.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;





@TableName("HouseWare")    // MyBatis Plus 注解，指定表名
public class HouseWare {

    @TableId(value = "ID", type = IdType.AUTO)
    private Long id;
    private String name;
    private String variation;
    private String bodyTitle;
    private String pattern;
    private String patternTitle;
    private String diy;
    private String bodyCustomize;
    private String patternCustomize;
    private Integer kitCost;
    private Integer buyPrice;
    private Integer sellPrice;
    private Integer milesPrice;
    private String color1;
    private String color2;
    private String size;
    private String interact;
    private String tag;
    private String outdoor;
    private String source;
    private String sourceNotes;
    private String hhaConcept1;
    private String hhaConcept2;
    private String hhaSeries;
    private String hhaSet;
    private String speakerType;
    private String lightingType;

    // Getter and Setter methods
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariation() {
        return variation;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public String getBodyTitle() {
        return bodyTitle;
    }

    public void setBodyTitle(String bodyTitle) {
        this.bodyTitle = bodyTitle;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getPatternTitle() {
        return patternTitle;
    }

    public void setPatternTitle(String patternTitle) {
        this.patternTitle = patternTitle;
    }

    public String getDiy() {
        return diy;
    }

    public void setDiy(String diy) {
        this.diy = diy;
    }

    public String getBodyCustomize() {
        return bodyCustomize;
    }

    public void setBodyCustomize(String bodyCustomize) {
        this.bodyCustomize = bodyCustomize;
    }

    public String getPatternCustomize() {
        return patternCustomize;
    }

    public void setPatternCustomize(String patternCustomize) {
        this.patternCustomize = patternCustomize;
    }

    public Integer getKitCost() {
        return kitCost;
    }

    public void setKitCost(Integer kitCost) {
        this.kitCost = kitCost;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Integer getMilesPrice() {
        return milesPrice;
    }

    public void setMilesPrice(Integer milesPrice) {
        this.milesPrice = milesPrice;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }

    public String getColor2() {
        return color2;
    }

    public void setColor2(String color2) {
        this.color2 = color2;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getInteract() {
        return interact;
    }

    public void setInteract(String interact) {
        this.interact = interact;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getOutdoor() {
        return outdoor;
    }

    public void setOutdoor(String outdoor) {
        this.outdoor = outdoor;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getSourceNotes() {
        return sourceNotes;
    }

    public void setSourceNotes(String sourceNotes) {
        this.sourceNotes = sourceNotes;
    }

    public String getHhaConcept1() {
        return hhaConcept1;
    }

    public void setHhaConcept1(String hhaConcept1) {
        this.hhaConcept1 = hhaConcept1;
    }

    public String getHhaConcept2() {
        return hhaConcept2;
    }

    public void setHhaConcept2(String hhaConcept2) {
        this.hhaConcept2 = hhaConcept2;
    }

    public String getHhaSeries() {
        return hhaSeries;
    }

    public void setHhaSeries(String hhaSeries) {
        this.hhaSeries = hhaSeries;
    }

    public String getHhaSet() {
        return hhaSet;
    }

    public void setHhaSet(String hhaSet) {
        this.hhaSet = hhaSet;
    }

    public String getSpeakerType() {
        return speakerType;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

    public String getLightingType() {
        return lightingType;
    }

    public void setLightingType(String lightingType) {
        this.lightingType = lightingType;
    }
}
