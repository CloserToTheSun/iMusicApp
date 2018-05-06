package com.example.android.imusicplay;

/**
 * Created by Nabol Furmoli on 3/13/2018.
 */

public class song {

    private String songName;
    private String authorName;
    private int image_id;

    public song(String msongName, String mauthorName, int mimage_id) {
        songName = msongName;
        authorName = mauthorName;
        image_id=mimage_id;
    }

    public String getSongName() {
        return songName;
    }

    public String getAuthorName() {

        return authorName;
    }

    public int getImageId() {

        return image_id;
    }
}