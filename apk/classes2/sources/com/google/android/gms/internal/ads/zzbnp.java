package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzbnp implements Runnable {
    public final /* synthetic */ zzboi zza;
    public final /* synthetic */ zzboh zzb;
    public final /* synthetic */ zzbnd zzc;
    public final /* synthetic */ ArrayList zzd;
    public final /* synthetic */ long zze;

    public /* synthetic */ zzbnp(zzboi zzboi, zzboh zzboh, zzbnd zzbnd, ArrayList arrayList, long j) {
        this.zza = zzboi;
        this.zzb = zzboh;
        this.zzc = zzbnd;
        this.zzd = arrayList;
        this.zze = j;
    }

    public final void run() {
        zzboi.zzi(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
