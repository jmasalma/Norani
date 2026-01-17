package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.client.zzgc;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdmu {
    private final zzfcw zza;
    private final Executor zzb;
    private final zzdpj zzc;
    private final zzdoe zzd;
    private final Context zze;
    private final zzdsj zzf;
    private final zzfjy zzg;
    private final zzeca zzh;
    private final zzdsd zzi;

    public zzdmu(zzfcw zzfcw, Executor executor, zzdpj zzdpj, Context context, zzdsj zzdsj, zzfjy zzfjy, zzeca zzeca, zzdoe zzdoe, zzdsd zzdsd) {
        this.zza = zzfcw;
        this.zzb = executor;
        this.zzc = zzdpj;
        this.zze = context;
        this.zzf = zzdsj;
        this.zzg = zzfjy;
        this.zzh = zzeca;
        this.zzd = zzdoe;
        this.zzi = zzdsd;
    }

    public static /* synthetic */ ListenableFuture zza(zzdmu zzdmu, zzb zzb2, zzbya zzbya, Object obj) {
        zzcfg zza2 = zzdmu.zzc.zza(zzr.zzc(), (zzfca) null, (zzfcd) null);
        zzcaj zza3 = zzcaj.zza(zza2);
        zzdmu.zzh(zza2, zzb2, zzbya);
        zza2.zzN().zzK(new zzdmm(zza3));
        zza2.loadUrl((String) zzbd.zzc().zzb(zzbde.zzeb));
        return zza3;
    }

    public static /* synthetic */ ListenableFuture zzb(zzdmu zzdmu, JSONObject jSONObject, zzcfg zzcfg) {
        zzbmp zzbmp = zzdmu.zza.zzb;
        zzcaj zza2 = zzcaj.zza(zzcfg);
        if (zzbmp != null) {
            zzcfg.zzaj(zzchd.zzd());
        } else {
            zzcfg.zzaj(zzchd.zze());
        }
        zzcfg.zzN().zzC(new zzdml(zzdmu, zzcfg, zza2));
        zzcfg.zzp("google.afma.nativeAds.renderVideo", jSONObject);
        return zza2;
    }

    public static /* synthetic */ ListenableFuture zzc(zzdmu zzdmu, zzr zzr, zzfca zzfca, zzfcd zzfcd, zzb zzb2, zzbya zzbya, String str, String str2, Object obj) {
        zzdmu zzdmu2 = zzdmu;
        zzcfg zza2 = zzdmu2.zzc.zza(zzr, zzfca, zzfcd);
        zzcaj zza3 = zzcaj.zza(zza2);
        if (zzdmu2.zza.zzb != null) {
            zzdmu2.zzh(zza2, zzb2, zzbya);
            zza2.zzaj(zzchd.zzd());
        } else {
            zzb zzb3 = zzb2;
            zzbya zzbya2 = zzbya;
            zzdob zzb4 = zzdmu2.zzd.zzb();
            zzcgy zzN = zza2.zzN();
            zzbcv zzbcv = zzbde.zznP;
            zzN.zzX(zzb4, zzb4, zzb4, zzb4, zzb4, false, (zzbki) null, !((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue() ? new zzb(zzdmu2.zze, (zzbya) null, (zzbuy) null) : zzb3, (zzbsv) null, true != ((Boolean) zzbd.zzc().zzb(zzbcv)).booleanValue() ? null : zzbya2, zzdmu2.zzh, zzdmu2.zzg, zzdmu2.zzf, (zzbkz) null, zzb4, (zzbky) null, (zzbks) null, (zzbkg) null, (zzcmq) null);
            zzj(zza2);
        }
        zza2.zzN().zzC(new zzdmj(zzdmu2, zza2, zza3));
        zza2.zzae(str, str2, (String) null);
        return zza3;
    }

    public static /* synthetic */ void zzf(zzdmu zzdmu, zzcfg zzcfg, zzcaj zzcaj, boolean z, int i, String str, String str2) {
        if (z) {
            zzgc zzgc = zzdmu.zza.zza;
            if (!(zzgc == null || zzcfg.zzq() == null)) {
                zzcfg.zzq().zzs(zzgc);
            }
            zzcaj.zzb();
            return;
        }
        zzcaj.zzd(new zzehf(1, "Html video Web View failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
    }

    public static /* synthetic */ void zzg(zzdmu zzdmu, zzcfg zzcfg, zzcaj zzcaj, boolean z, int i, String str, String str2) {
        if (!((Boolean) zzbd.zzc().zzb(zzbde.zzej)).booleanValue()) {
            zzdmu.zzi(zzcfg, zzcaj);
        } else if (z) {
            zzdmu.zzi(zzcfg, zzcaj);
        } else {
            zzcaj.zzd(new zzehf(1, "Native Video WebView failed to load. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2));
        }
    }

    private final void zzh(zzcfg zzcfg, zzb zzb2, zzbya zzbya) {
        zzj(zzcfg);
        zzcfg.zzag("/video", zzbke.zzl);
        zzcfg.zzag("/videoMeta", zzbke.zzm);
        zzcfg.zzag("/precache", new zzcdo());
        zzcfg.zzag("/delayPageLoaded", zzbke.zzp);
        zzcfg.zzag("/instrument", zzbke.zzn);
        zzcfg.zzag("/log", zzbke.zzg);
        zzcfg.zzag("/click", new zzbjd((zzded) null, (zzcmq) null));
        if (this.zza.zzb != null) {
            zzcfg.zzN().zzH(true);
            zzcfg.zzag("/open", new zzbkr(true != ((Boolean) zzbd.zzc().zzb(zzbde.zznP)).booleanValue() ? null : zzb2, (zzbso) null, (zzeca) null, (zzdsj) null, (zzcmq) null));
        } else {
            zzcfg.zzN().zzH(false);
        }
        if (zzv.zzo().zzp(zzcfg.getContext())) {
            Map hashMap = new HashMap();
            if (zzcfg.zzD() != null) {
                hashMap = zzcfg.zzD().zzaw;
            }
            zzcfg.zzag("/logScionEvent", new zzbkl(zzcfg.getContext(), hashMap));
        }
        if (((Boolean) zzbd.zzc().zzb(zzbde.zznP)).booleanValue()) {
            zzcfg.zzN().zzD(zzb2);
            zzcfg.zzN().zzL(zzbya);
        }
    }

    private final void zzi(zzcfg zzcfg, zzcaj zzcaj) {
        zzgc zzgc = this.zza.zza;
        if (!(zzgc == null || zzcfg.zzq() == null)) {
            zzcfg.zzq().zzs(zzgc);
        }
        zzcaj.zzb();
    }

    private static final void zzj(zzcfg zzcfg) {
        zzcfg.zzag("/videoClicked", zzbke.zzh);
        zzcfg.zzN().zzJ(true);
        zzcfg.zzag("/getNativeAdViewSignals", zzbke.zzs);
        zzcfg.zzag("/getNativeClickMeta", zzbke.zzt);
    }

    public final ListenableFuture zzd(JSONObject jSONObject, zzb zzb2, zzbya zzbya) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzi.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_VIDEO_START.zza(), zzv.zzD().currentTimeMillis());
        }
        ListenableFuture zzh2 = zzgdn.zzh((Object) null);
        zzdmo zzdmo = new zzdmo(this, zzb2, zzbya);
        Executor executor = this.zzb;
        return zzgdn.zzn(zzgdn.zzn(zzh2, zzdmo, executor), new zzdmn(this, jSONObject), executor);
    }

    public final ListenableFuture zze(String str, String str2, zzfca zzfca, zzfcd zzfcd, zzr zzr, zzb zzb2, zzbya zzbya) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzcx)).booleanValue()) {
            this.zzi.zza().putLong(zzdrr.NATIVE_ASSETS_LOADING_VIDEO_COMPOSITION_START.zza(), zzv.zzD().currentTimeMillis());
        }
        return zzgdn.zzn(zzgdn.zzh((Object) null), new zzdmk(this, zzr, zzfca, zzfcd, zzb2, zzbya, str, str2), this.zzb);
    }
}
