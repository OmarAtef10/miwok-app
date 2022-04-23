package com.example.android.miwok;

public class CustomWord {
    private String defaultTranslation;
    private String miwokTranslation;
    private int imgID;



    public CustomWord(String defaultTranslation, String miwokTranslation) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        imgID=0;
    }

    public CustomWord(String defaultTranslation, String miwokTranslation, int imgID) {
        this.defaultTranslation = defaultTranslation;
        this.miwokTranslation = miwokTranslation;
        this.imgID=imgID;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImgID(){
        return imgID;
    }
    public boolean hasImg(){
        if (imgID!=0){
            return true;
        }
        return false;
    }
}
