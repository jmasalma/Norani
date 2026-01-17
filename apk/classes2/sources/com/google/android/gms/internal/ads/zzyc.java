package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzyc implements zzyo {
    public final /* synthetic */ zzyi zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;

    public /* synthetic */ zzyc(zzyi zzyi, String str, String str2) {
        this.zza = zzyi;
        this.zzb = str;
        this.zzc = str2;
    }

    public final List zza(int i, zzbm zzbm, int[] iArr) {
        int i2 = zzyu.zzb;
        int i3 = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        for (int i4 = 0; i4 < zzbm.zza; i4++) {
            String str = this.zzc;
            int i5 = i;
            zzbm zzbm2 = zzbm;
            int i6 = i4;
            zzfyn.zzf(new zzyn(i5, zzbm2, i6, this.zza, iArr[i4], this.zzb, str));
        }
        return zzfyn.zzi();
    }
}
