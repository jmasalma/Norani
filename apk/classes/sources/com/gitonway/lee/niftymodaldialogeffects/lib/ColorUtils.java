package com.gitonway.lee.niftymodaldialogeffects.lib;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import androidx.core.internal.view.SupportMenu;

public class ColorUtils {
    public static ColorFilter getColorFilter(int i) {
        return new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) ((16711680 & i) / SupportMenu.USER_MASK), 0.0f, 0.0f, 0.0f, 0.0f, (float) ((65280 & i) / 255), 0.0f, 0.0f, 0.0f, 0.0f, (float) (i & 255), 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }
}
