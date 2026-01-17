package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfnd {
    private static UiModeManager zza;

    public static zzflr zza() {
        UiModeManager uiModeManager = zza;
        if (uiModeManager == null) {
            return zzflr.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType == 1) {
            return zzflr.MOBILE;
        }
        if (currentModeType != 4) {
            return zzflr.OTHER;
        }
        return zzflr.CTV;
    }

    public static void zzb(Context context) {
        if (context != null) {
            zza = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
