package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdui implements Runnable {
    public final /* synthetic */ zzdun zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbmh zzc;
    public final /* synthetic */ zzfdu zzd;
    public final /* synthetic */ List zze;

    public /* synthetic */ zzdui(zzdun zzdun, String str, zzbmh zzbmh, zzfdu zzfdu, List list) {
        this.zza = zzdun;
        this.zzb = str;
        this.zzc = zzbmh;
        this.zzd = zzfdu;
        this.zze = list;
    }

    public final void run() {
        zzdun.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }
}
