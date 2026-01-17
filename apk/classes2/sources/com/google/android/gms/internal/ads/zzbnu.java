package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzby;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbnu implements zzbkf {
    final /* synthetic */ zzbnd zza;
    final /* synthetic */ zzby zzb;
    final /* synthetic */ zzboi zzc;

    zzbnu(zzboi zzboi, zzavu zzavu, zzbnd zzbnd, zzby zzby) {
        this.zza = zzbnd;
        this.zzb = zzby;
        Objects.requireNonNull(zzboi);
        this.zzc = zzboi;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzboj zzboj = (zzboj) obj;
        zze.zza("loadJavascriptEngine > /requestReload handler: Trying to acquire lock");
        zzboi zzboi = this.zzc;
        synchronized (zzboi.zza) {
            zze.zza("loadJavascriptEngine > /requestReload handler: Lock acquired");
            zzo.zzi("JS Engine is requesting an update");
            if (zzboi.zzi == 0) {
                zzo.zzi("Starting reload.");
                zzboi.zzi = 2;
                zzboi.zzd((zzavu) null);
            }
            this.zza.zzr("/requestReload", (zzbkf) this.zzb.zza());
        }
        zze.zza("loadJavascriptEngine > /requestReload handler: Lock released");
    }
}
