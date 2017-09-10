package com.ghaleeb.wifychat;

import android.graphics.Color;

import com.nightonke.boommenu.BoomButtons.HamButton;

/**
 * Created by ghaleeb on 03-Aug-17.
 */

class BuilderManager
{
    private static int[] imageResources = new int[]{

            R.drawable.wify,
            R.drawable.wifioff,
            R.drawable.wifi,
            R.drawable.hotspot

    };
    private static int imageResourceIndex = 0;

    static int getImageResource()
    {
        if (imageResourceIndex >= imageResources.length) imageResourceIndex = 0;
        return imageResources[imageResourceIndex++];
    }
    static HamButton.Builder getHamButtonBuilderWithDifferentPieceColor() {
        return new HamButton.Builder()
                .normalImageRes(getImageResource())
                .normalTextRes(R.string.text_ham_button_text_normal)
                .subNormalTextRes(R.string.text_ham_button_sub_text_normal)
                .pieceColor(Color.WHITE);

    }
    private static BuilderManager ourInstance = new BuilderManager();

    public static BuilderManager getInstance() {
        return ourInstance;
    }

    private BuilderManager() {
    }
}

