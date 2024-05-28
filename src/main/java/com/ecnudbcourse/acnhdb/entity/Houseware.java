package com.ecnudbcourse.acnhdb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "houseware")
public class Houseware {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

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
    private String color_1;
    private String color_2;
    private String size;
    private String interact;
    private String tag;
    private String outdoor;
    private String source;
    private String sourceNotes;
    private String hhaConcept_1;
    private String hhaConcept_2;
    private String hhaSeries;
    private String hhaSet;
    private String speakerType;
    private String lightingType;

    // Getters
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getVariation() {
        return variation;
    }

    public String getBodyTitle() {
        return bodyTitle;
    }

    public String getPattern() {
        return pattern;
    }

    public String getPatternTitle() {
        return patternTitle;
    }

    public String getDiy() {
        return diy;
    }

    public String getBodyCustomize() {
        return bodyCustomize;
    }

    public String getPatternCustomize() {
        return patternCustomize;
    }

    public Integer getKitCost() {
        return kitCost;
    }

    public Integer getBuyPrice() {
        return buyPrice;
    }

    public Integer getSellPrice() {
        return sellPrice;
    }

    public Integer getMilesPrice() {
        return milesPrice;
    }

    public String getColor_1() {
        return color_1;
    }

    public String getColor_2() {
        return color_2;
    }

    public String getSize() {
        return size;
    }

    public String getInteract() {
        return interact;
    }

    public String getTag() {
        return tag;
    }

    public String getOutdoor() {
        return outdoor;
    }

    public String getSource() {
        return source;
    }

    public String getSourceNotes() {
        return sourceNotes;
    }

    public String getHhaConcept_1() {
        return hhaConcept_1;
    }

    public String getHhaConcept_2() {
        return hhaConcept_2;
    }

    public String getHhaSeries() {
        return hhaSeries;
    }

    public String getHhaSet() {
        return hhaSet;
    }

    public String getSpeakerType() {
        return speakerType;
    }

    public String getLightingType() {
        return lightingType;
    }

    // Setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVariation(String variation) {
        this.variation = variation;
    }

    public void setBodyTitle(String bodyTitle) {
        this.bodyTitle = bodyTitle;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public void setPatternTitle(String patternTitle) {
        this.patternTitle = patternTitle;
    }

    public void setDiy(String diy) {
        this.diy = diy;
    }

    public void setBodyCustomize(String bodyCustomize) {
        this.bodyCustomize = bodyCustomize;
    }

    public void setPatternCustomize(String patternCustomize) {
        this.patternCustomize = patternCustomize;
    }

    public void setKitCost(Integer kitCost) {
        this.kitCost = kitCost;
    }

    public void setBuyPrice(Integer buyPrice) {
        this.buyPrice = buyPrice;
    }

    public void setSellPrice(Integer sellPrice) {
        this.sellPrice = sellPrice;
    }

    public void setMilesPrice(Integer milesPrice) {
        this.milesPrice = milesPrice;
    }

    public void setColor_1(String color_1) {
        this.color_1 = color_1;
    }

    public void setColor_2(String color_2) {
        this.color_2 = color_2;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setInteract(String interact) {
        this.interact = interact;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setOutdoor(String outdoor) {
        this.outdoor = outdoor;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setSourceNotes(String sourceNotes) {
        this.sourceNotes = sourceNotes;
    }

    public void setHhaConcept_1(String hhaConcept_1) {
        this.hhaConcept_1 = hhaConcept_1;
    }

    public void setHhaConcept_2(String hhaConcept_2) {
        this.hhaConcept_2 = hhaConcept_2;
    }

    public void setHhaSeries(String hhaSeries) {
        this.hhaSeries = hhaSeries;
    }

    public void setHhaSet(String hhaSet) {
        this.hhaSet = hhaSet;
    }

    public void setSpeakerType(String speakerType) {
        this.speakerType = speakerType;
    }

    public void setLightingType(String lightingType) {
        this.lightingType = lightingType;
    }
}
