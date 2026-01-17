package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzv;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdxe implements zzhgr {
    private final zzhha zza;
    private final zzhha zzb;

    private zzdxe(zzhha zzhha, zzhha zzhha2) {
        this.zza = zzhha;
        this.zzb = zzhha2;
    }

    public static zzdxe zza(zzhha zzhha, zzhha zzhha2) {
        return new zzdxe(zzhha, zzhha2);
    }

    public final /* synthetic */ Object zzb() {
        zzfha zzfha = (zzfha) this.zza.zzb();
        CookieManager zza2 = zzv.zzs().zza((Context) this.zzb.zzb());
        zzfgu zzfgu = zzfgu.WEBVIEW_COOKIE;
        Objects.requireNonNull(zzfha);
        return zzfgk.zza(new zzdwy(zza2), zzfgu, zzfha).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzfgl(new zzdwz())).zza();
    }
}
