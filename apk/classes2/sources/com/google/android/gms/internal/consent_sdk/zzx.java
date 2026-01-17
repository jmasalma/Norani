package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
public final class zzx implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;

    public zzx(zzdr zzdr, zzdr zzdr2, zzdr zzdr3, zzdr zzdr4, zzdr zzdr5, zzdr zzdr6, zzdr zzdr7, zzdr zzdr8, zzdr zzdr9) {
        this.zza = zzdr;
        this.zzb = zzdr2;
        this.zzc = zzdr5;
        this.zzd = zzdr6;
        this.zze = zzdr7;
        this.zzf = zzdr8;
        this.zzg = zzdr9;
    }

    /* renamed from: zzb */
    public final zzw zza() {
        Handler zzb2 = zzat.zzb();
        Handler handler = zzb2;
        Executor zzb3 = zzav.zzb();
        Executor executor = zzb3;
        zzn zzb4 = ((zzq) this.zze).zza();
        zzz zzb5 = ((zzac) this.zzf).zza();
        zzn zzn = zzb4;
        zzz zzz = zzb5;
        return new zzw((Application) this.zza.zza(), (zzad) this.zzb.zza(), zzb2, zzb3, (zzaq) this.zzc.zza(), (zzbo) this.zzd.zza(), zzb4, zzb5, (zze) this.zzg.zza());
    }
}
