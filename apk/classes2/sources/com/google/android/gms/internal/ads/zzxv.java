package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzxv implements zzyo {
    public final /* synthetic */ zzyi zza;

    public /* synthetic */ zzxv(zzyi zzyi) {
        this.zza = zzyi;
    }

    public final List zza(int i, zzbm zzbm, int[] iArr) {
        int i2 = zzyu.zzb;
        int i3 = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        for (int i4 = 0; i4 < zzbm.zza; i4++) {
            zzfyn.zzf(new zzyf(i, zzbm, i4, this.zza, iArr[i4]));
        }
        return zzfyn.zzi();
    }
}
