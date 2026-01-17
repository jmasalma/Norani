package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzm;
import com.google.android.gms.ads.internal.client.zzx;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeyw implements zzffe {
    public final zzezq zza;
    public final zzezs zzb;
    public final zzm zzc;
    public final String zzd;
    public final Executor zze;
    public final zzx zzf;
    public final zzfet zzg;

    public zzeyw(zzezq zzezq, zzezs zzezs, zzm zzm, String str, Executor executor, zzx zzx, zzfet zzfet) {
        this.zza = zzezq;
        this.zzb = zzezs;
        this.zzc = zzm;
        this.zzd = str;
        this.zze = executor;
        this.zzf = zzx;
        this.zzg = zzfet;
    }

    public final zzfet zza() {
        return this.zzg;
    }

    public final Executor zzb() {
        return this.zze;
    }
}
