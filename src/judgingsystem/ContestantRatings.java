/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package judgingsystem;

public class ContestantRatings {
    private int voiceQuality;
    private int interpretation;
    private int musicality;

    public ContestantRatings() {
        // Default constructor
        this.voiceQuality = 0;
        this.interpretation = 0;
        this.musicality = 0;
    }

    public ContestantRatings(int voiceQuality, int interpretation, int musicality) {
        this.voiceQuality = voiceQuality;
        this.interpretation = interpretation;
        this.musicality = musicality;
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
}

