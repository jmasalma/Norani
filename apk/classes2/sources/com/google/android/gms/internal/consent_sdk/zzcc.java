package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzcc implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;

    public zzcc(zzdr zzdr, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5, zzdr zzdr6, zzdr zzdr7, zzdr zzdr8) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr5;
        this.zzd = zzdr6;
        this.zze = zzdr7;
        this.zzf = zzdr8;
    }

    /* renamed from: zzb */
    public final zzcb zza() {
        Handler zzb2 = zzat.zzb();
        Handler handler = zzb2;
        Executor zzb3 = zzav.zzb();
        Executor executor = zzb3;
        zzao zzb4 = ((zzap) this.zzd).zza();
        zzao zzao = zzb4;
        return new zzcb((Application) this.zza.zza(), (zzbx) this.zzb.zza(), zzb2, zzb3, (zze) this.zzc.zza(), zzb4, (zzbc) this.zze.zza(), (zzaq) this.zzf.zza());
    }
}
