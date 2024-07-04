/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package judgingsystem;

/**
 *
 * @author lentrix
 */
public class Contestant {
    private String name;
    private int voiceQuality;
    private int interpretation;
    private int musicality;

    public Contestant(String name, int voiceQuality, int interpretation, int musicality) {
        this.name = name;
        this.voiceQuality = voiceQuality;
        this.interpretation = interpretation;
        this.musicality = musicality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVoiceQuality() {
        return voiceQuality;
    }

    public void setVoiceQuality(int voiceQuality) {
        this.voiceQuality = voiceQuality;
    }

    public int getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(int interpretation) {
        this.interpretation = interpretation;
    }

    public int getMusicality() {
        return musicality;
    }

    public void setMusicality(int musicality) {
        this.musicality = musicality;
    }

    @Override
    public String toString() {
        return name;
    }
    
    public void updateVoiceQuality(int score) {
        this.voiceQuality = score;
    }

    public void updateInterpretation(int score) {
        this.interpretation = score;
    }

    public void updateMusicality(int score) {
        this.musicality = score;
    }
    
    
}
