package com.example.android.miwok;

public class CustomWord {
    private String defaultTranslation;
    private String miwokTranslation;
    private int imgID;
    private int audioId;


    public CustomWord(String defaultTranslation, String miwokTranslation, int audioId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.audioId = audioId;
        imgID = 0;
    }

    public CustomWord(String defaultTranslation, String miwokTranslation, int imgID, int audioId) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imgID = imgID;
        this.audioId = audioId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getAudioId(){
        return audioId;
    }

    public int getImgID() {
        return imgID;
    }

    public boolean hasImg() {
        if (imgID != 0) {
            return true;
        }
        return false;
    }
}
