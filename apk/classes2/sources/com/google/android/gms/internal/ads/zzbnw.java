package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.ArrayList;
import java.util.Objects;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbnw implements Runnable {
    final /* synthetic */ zzboh zza;
    final /* synthetic */ zzbnd zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzboi zze;

    zzbnw(zzboi zzboi, zzboh zzboh, zzbnd zzbnd, ArrayList arrayList, long j) {
        this.zza = zzboh;
        this.zzb = zzbnd;
        this.zzc = arrayList;
        this.zzd = j;
        Objects.requireNonNull(zzboi);
        this.zze = zzboi;
    }

    public final void run() {
        String str;
        zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Trying to acquire lock");
        zzboi zzboi = this.zze;
        synchronized (zzboi.zza) {
            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock acquired");
            zzboh zzboh = this.zza;
            if (zzboh.zze() != -1) {
                if (zzboh.zze() != 1) {
                    if (((Boolean) zzbd.zzc().zzb(zzbde.zzhZ)).booleanValue()) {
                        zzboh.zzh(new TimeoutException("Unable to fully load JS engine."), "SdkJavascriptFactory.loadJavascriptEngine.Runnable");
                    } else {
                        zzboh.zzg();
                    }
                    zzgdy zzgdy = zzcaf.zzf;
                    zzbnd zzbnd = this.zzb;
                    Objects.requireNonNull(zzbnd);
                    zzgdy.execute(new zzbnv(zzbnd));
                    String valueOf = String.valueOf(zzbd.zzc().zzb(zzbde.zzd));
                    int zze2 = zzboh.zze();
                    int zza2 = zzboi.zzi;
                    ArrayList arrayList = this.zzc;
                    if (arrayList.isEmpty()) {
                        str = ". Still waiting for the engine to be loaded";
                    } else {
                        str = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is " + String.valueOf(arrayList.get(0));
                    }
                    zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze2 + ". Update status(fullLoadTimeout) is " + zza2 + str + " ms. Total latency(fullLoadTimeout) is " + (zzv.zzD().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
                    zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released");
                    return;
                }
            }
            zze.zza("loadJavascriptEngine > ADMOB_UI_HANDLER.postDelayed: Lock released, the promise is already settled");
        }
    }
}
