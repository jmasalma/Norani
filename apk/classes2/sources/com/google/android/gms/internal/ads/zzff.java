package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public class zzff {
    public final int zzd;

    /* synthetic */ zzff(int i, zzfe zzfe) {
        this.zzd = i;
    }

    public static String zze(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) ((i >> 24) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE));
        sb.append((char) (i & KotlinVersion.MAX_COMPONENT_VALUE));
        return sb.toString();
    }

    public String toString() {
        return zze(this.zzd);
    }
}
