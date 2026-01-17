package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdkh {
    private final zzdpj zza;
    private final zzdny zzb;
    private final zzcnx zzc;
    private final zzdjb zzd;

    public zzdkh(zzdpj zzdpj, zzdny zzdny, zzcnx zzcnx, zzdjb zzdjb) {
        this.zza = zzdpj;
        this.zzb = zzdny;
        this.zzc = zzcnx;
        this.zzd = zzdjb;
    }

    public static /* synthetic */ void zzb(zzdkh zzdkh, zzcfg zzcfg, Map map) {
        int i = zze.zza;
        zzo.zzi("Hiding native ads overlay.");
        zzcfg.zzF().setVisibility(8);
        zzdkh.zzc.zze(false);
    }

    public static /* synthetic */ void zzd(zzdkh zzdkh, zzcfg zzcfg, Map map) {
        int i = zze.zza;
        zzo.zzi("Showing native ads overlay.");
        zzcfg.zzF().setVisibility(0);
        zzdkh.zzc.zze(true);
    }

    public static /* synthetic */ void zze(zzdkh zzdkh, Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        zzdkh.zzb.zzj("sendMessageToNativeJs", hashMap);
    }

    public final View zza() throws zzcfs {
        zzcfg zza2 = this.zza.zza(zzr.zzc(), (zzfca) null, (zzfcd) null);
        zza2.zzF().setVisibility(8);
        zza2.zzag("/sendMessageToSdk", new zzdkb(this));
        zza2.zzag("/adMuted", new zzdkc(this));
        WeakReference weakReference = new WeakReference(zza2);
        zzdkd zzdkd = new zzdkd(this);
        zzdny zzdny = this.zzb;
        zzdny.zzm(weakReference, "/loadHtml", zzdkd);
        zzdny.zzm(new WeakReference(zza2), "/showOverlay", new zzdke(this));
        zzdny.zzm(new WeakReference(zza2), "/hideOverlay", new zzdkf(this));
        return zza2.zzF();
    }
}
