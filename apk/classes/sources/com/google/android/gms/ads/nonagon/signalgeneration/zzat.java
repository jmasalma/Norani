package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzdsd;
import com.google.android.gms.internal.ads.zzgdj;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzat implements zzgdj {
    final /* synthetic */ zzau zza;

    zzat(zzau zzau) {
        Objects.requireNonNull(zzau);
        this.zza = zzau;
    }

    public final void zza(Throwable th) {
        zzv.zzp().zzw(th, "SignalGeneratorImpl.initializeWebViewForSignalCollection");
        zzau zzau = this.zza;
        zzaa.zzd(zzau.zzp, (zzdsd) null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzau.zzH.get())));
        int i = zze.zza;
        zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkf)).booleanValue() && !zzau.zzG.get()) {
            if (zzau.zzH.getAndIncrement() < ((Integer) zzbd.zzc().zzb(zzbde.zzkg)).intValue()) {
                zzau.zzT();
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbk zzbk = (zzbk) obj;
        int i = zze.zza;
        zzo.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzkf)).booleanValue()) {
            zzau zzau = this.zza;
            zzaa.zzd(zzau.zzp, (zzdsd) null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzau.zzH.get())));
            zzau.zzG.set(true);
        }
    }
}
