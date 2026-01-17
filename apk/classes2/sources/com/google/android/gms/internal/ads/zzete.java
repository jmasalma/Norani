package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzete implements Runnable {
    public final /* synthetic */ zzeti zza;
    public final /* synthetic */ zzbrp zzb;
    public final /* synthetic */ Bundle zzc;
    public final /* synthetic */ List zzd;
    public final /* synthetic */ zzejx zze;
    public final /* synthetic */ zzcak zzf;

    public /* synthetic */ zzete(zzeti zzeti, zzbrp zzbrp, Bundle bundle, List list, zzejx zzejx, zzcak zzcak) {
        this.zza = zzeti;
        this.zzb = zzbrp;
        this.zzc = bundle;
        this.zzd = list;
        this.zze = zzejx;
        this.zzf = zzcak;
    }

    public final void run() {
        zzeti.zze(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
    }
}
