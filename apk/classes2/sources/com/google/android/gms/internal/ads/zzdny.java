package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzb;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdny {
    /* access modifiers changed from: private */
    public final zzdnl zza = new zzdnl();
    private final zza zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final zzdsj zzd;
    private final Executor zze;
    private final zzavu zzf;
    private final VersionInfoParcel zzg;
    private final zzbkv zzh = new zzbkv();
    /* access modifiers changed from: private */
    public final zzeca zzi;
    /* access modifiers changed from: private */
    public final zzfjy zzj;
    private final zzecl zzk;
    private final zzfda zzl;
    private ListenableFuture zzm;

    zzdny(zzdnv zzdnv) {
        this.zzc = zzdnv.zzb;
        this.zze = zzdnv.zze;
        this.zzf = zzdnv.zzf;
        this.zzg = zzdnv.zzg;
        this.zzb = zzdnv.zza;
        this.zzi = zzdnv.zzd;
        this.zzj = zzdnv.zzh;
        this.zzd = zzdnv.zzc;
        this.zzk = zzdnv.zzi;
        this.zzl = zzdnv.zzj;
    }

    public static /* synthetic */ zzcfg zza(zzdny zzdny, zzcfg zzcfg) {
        zzdny zzdny2 = zzdny;
        zzcfg zzcfg2 = zzcfg;
        zzcfg2.zzag("/result", zzdny2.zzh);
        zzcgy zzN = zzcfg.zzN();
        zzb zzb2 = r2;
        zzb zzb3 = new zzb(zzdny2.zzc, (zzbya) null, (zzbuy) null);
        zzdnl zzdnl = zzdny2.zza;
        zzN.zzX((com.google.android.gms.ads.internal.client.zza) null, zzdnl, zzdnl, zzdnl, zzdnl, false, (zzbki) null, zzb2, (zzbsv) null, (zzbya) null, zzdny2.zzi, zzdny2.zzj, zzdny2.zzd, (zzbkz) null, (zzded) null, (zzbky) null, (zzbks) null, (zzbkg) null, (zzcmq) null);
        return zzcfg2;
    }

    public final synchronized ListenableFuture zzg(String str, JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzgdn.zzh((Object) null);
        }
        return zzgdn.zzn(listenableFuture, new zzdnm(this, str, jSONObject), this.zze);
    }

    public final synchronized void zzh(zzfca zzfca, zzfcd zzfcd, zzcmq zzcmq) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgdn.zzr(listenableFuture, new zzdns(this, zzfca, zzfcd, zzcmq), this.zze);
        }
    }

    public final synchronized void zzi() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgdn.zzr(listenableFuture, new zzdno(this), this.zze);
            this.zzm = null;
        }
    }

    public final synchronized void zzj(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgdn.zzr(listenableFuture, new zzdnr(this, "sendMessageToNativeJs", map), this.zze);
        }
    }

    public final synchronized void zzk() {
        zzbcv zzbcv = zzbde.zzea;
        ListenableFuture zzm2 = zzgdn.zzm(zzgdn.zzk(new zzcfp(this.zzc, this.zzf, this.zzg, this.zzb, this.zzk, this.zzl, this.zzd, (String) zzbd.zzc().zzb(zzbcv)), zzcaf.zzf), new zzdnn(this), this.zze);
        this.zzm = zzm2;
        zzcai.zza(zzm2, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbkf zzbkf) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgdn.zzr(listenableFuture, new zzdnp(this, str, zzbkf), this.zze);
        }
    }

    public final void zzm(WeakReference weakReference, String str, zzbkf zzbkf) {
        zzl(str, new zzdnw(this, weakReference, str, zzbkf, (zzdnx) null));
    }

    public final synchronized void zzn(String str, zzbkf zzbkf) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture != null) {
            zzgdn.zzr(listenableFuture, new zzdnq(this, str, zzbkf), this.zze);
        }
    }
}
