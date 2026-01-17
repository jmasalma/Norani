package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzerr implements zzeuc {
    private final Context zza;
    private final Intent zzb;

    zzerr(Context context, Intent intent) {
        this.zza = context;
        this.zzb = intent;
    }

    public final int zza() {
        return 60;
    }

    public final ListenableFuture zzb() {
        zze.zza("HsdpMigrationSignal.produce");
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zznj)).booleanValue()) {
            return zzgdn.zzh(new zzers((Boolean) null));
        }
        boolean z = false;
        try {
            if (this.zzb.resolveActivity(this.zza.getPackageManager()) != null) {
                zze.zza("HSDP intent is supported");
                z = true;
            }
        } catch (Exception e) {
            zzv.zzp().zzw(e, "HsdpMigrationSignal.isHsdpMigrationSupported");
        }
        return zzgdn.zzh(new zzers(Boolean.valueOf(z)));
    }
}
