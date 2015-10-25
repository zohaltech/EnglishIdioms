package com.zohaltech.app.englishidioms.classes;


import com.zohaltech.app.englishidioms.R;

public final class ConstantParams {

    private static String apiSecurityKey  = App.context.getString(R.string.jan);

    public static String getApiSecurityKey() {
        return apiSecurityKey;
    }
}
