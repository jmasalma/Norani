package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbnt implements zzbkf {
    final /* synthetic */ long zza;
    final /* synthetic */ zzboh zzb;
    final /* synthetic */ zzbnd zzc;
    final /* synthetic */ zzboi zzd;

    zzbnt(zzboi zzboi, long j, zzboh zzboh, zzbnd zzbnd) {
        this.zza = j;
        this.zzb = zzboh;
        this.zzc = zzbnd;
        Objects.requireNonNull(zzboi);
        this.zzd = zzboi;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzboj zzboj = (zzboj) obj;
        long currentTimeMillis = zzv.zzD().currentTimeMillis() - this.zza;
        zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + currentTimeMillis + " ms.");
        zze.zza("loadJavascriptEngine > /jsLoaded handler: Trying to acquire lock");
        zzboi zzboi = this.zzd;
        synchronized (zzboi.zza) {
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock acquired");
            zzboh zzboh = this.zzb;
            if (zzboh.zze() != -1) {
                if (zzboh.zze() != 1) {
                    zzboi.zzi = 0;
                    zzbnd zzbnd = this.zzc;
                    zzbnd zzbnd2 = zzbnd;
                    zzbnd.zzq("/log", zzbke.zzg);
                    zzbnd.zzq("/result", zzbke.zzo);
                    zzboh.zzi(zzbnd);
                    zzboi.zzh = zzboh;
                    zze.zza("Successfully loaded JS Engine.");
                    zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released");
                    return;
                }
            }
            zze.zza("loadJavascriptEngine > /jsLoaded handler: Lock released, the promise is already settled");
        }
    }
}
