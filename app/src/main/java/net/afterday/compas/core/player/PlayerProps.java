package net.afterday.compas.core.player;

import net.afterday.compas.core.serialization.Jsonable;

/**
 * Created by spaka on 4/20/2018.
 */

public interface PlayerProps extends Jsonable
{
    double getHealth();
    double getRadiation();
    double getArtefactImpact();
    long getController();
    long getZombified();
    double getMental();
    double getRadiationImpact();
    double getHealthImpact();
    double getControllerImpact();
    double getBurerImpact();
    double getMentalImpact();
    double getMonolithImpact();
    double getAnomalyImpact();
    double getSpringboardImpact();
    double getFunnelImpact();
    double getCarouselImpact();
    double getElevatorImpact();
    double getFryingImpact();
    double getElectraImpact();
    double getMeatgrinderImpact();
    double getKisselImpact();
    double getSodaImpact();
    double getAcidfogImpact();
    double getBurningfluffImpact();
    double getRustyhairImpact();
    double getSpatialbubbleImpact();
    double getBoosterPercents();
    double getDevicePercents();
    double getArmorPercents();
    void addHealth(double health);
    void addRadiation(double radiation);
    void setRadiation(double radiation);
    void setState(Player.STATE state);
    boolean addXpPoints(int xp);
    void setXpPoints(int xp);
    int getXpPoints();
    int getLevel();
    void subtractHealth(double health);
    void subtractRadiation(double radiation);
    void setBoosterPercents(double percents);
    void setDevicePercents(double percents);
    void setArmorPercents(double percents);
    boolean burerHit();
    boolean controllerHit();
    boolean anomalyHit();
    boolean springboardHit();
    boolean funnelHit();
    boolean carouselHit();
    boolean elevatorHit();
    boolean fryingHit();
    boolean electraHit();
    boolean meatgrinderHit();
    boolean kisselHit();
    boolean sodaHit();
    boolean acidfogHit();
    boolean burningfluffHit();
    boolean rustyhairHit();
    boolean spatialbubbleHit();
    boolean mentalHit();
    boolean monolithHit();
    boolean emissionHit();
    boolean hasHealthInstant();
    boolean hasRadiationInstant();
    boolean setFraction(Player.FRACTION fraction);
    Player.FRACTION getFraction();
    int getLevelXp();
    Player.STATE getState();
    double[] getImpacts();
}
