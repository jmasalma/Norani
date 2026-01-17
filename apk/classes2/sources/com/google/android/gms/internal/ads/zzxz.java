package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzxz implements zzyo {
    public final /* synthetic */ zzyu zza;
    public final /* synthetic */ zzyi zzb;
    public final /* synthetic */ boolean zzc;
    public final /* synthetic */ int[] zzd;

    public /* synthetic */ zzxz(zzyu zzyu, zzyi zzyi, boolean z, int[] iArr) {
        this.zza = zzyu;
        this.zzb = zzyi;
        this.zzc = z;
        this.zzd = iArr;
    }

    public final List zza(int i, zzbm zzbm, int[] iArr) {
        zzxz zzxz = this;
        zzyu zzyu = zzxz.zza;
        zzyi zzyi = zzxz.zzb;
        zzyb zzyb = new zzyb(zzyu, zzyi);
        int i2 = zzxz.zzd[i];
        int i3 = zzfyq.zzd;
        zzfyn zzfyn = new zzfyn();
        zzbm zzbm2 = zzbm;
        int i4 = 0;
        while (i4 < zzbm2.zza) {
            boolean z = zzxz.zzc;
            zzye zzye = r1;
            zzye zzye2 = new zzye(i, zzbm, i4, zzyi, iArr[i4], z, zzyb, i2);
            zzfyn.zzf(zzye);
            i4++;
            zzxz = this;
        }
        return zzfyn.zzi();
    }
}
