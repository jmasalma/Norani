package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzmb {
    public static boolean zza(int i, boolean z) {
        int i2 = i & 7;
        if (i2 == 4) {
            return true;
        }
        if (z) {
            return i2 == 3;
        }
        return false;
    }
}
