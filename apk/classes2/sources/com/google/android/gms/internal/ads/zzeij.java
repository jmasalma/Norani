package com.google.android.gms.internal.ads;

import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzeij extends zzbwm {
    final /* synthetic */ zzcye zza;
    final /* synthetic */ zzcvw zzb;
    final /* synthetic */ zzcxf zzc;
    final /* synthetic */ zzdem zzd;

    zzeij(zzeik zzeik, zzcye zzcye, zzcvw zzcvw, zzcxf zzcxf, zzdem zzdem) {
        this.zza = zzcye;
        this.zzb = zzcvw;
        this.zzc = zzcxf;
        this.zzd = zzdem;
        Objects.requireNonNull(zzeik);
    }

    public final void zze(IObjectWrapper iObjectWrapper) {
        this.zzb.onAdClicked();
    }

    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zza.zzdw(4);
    }

    public final void zzg(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzh(IObjectWrapper iObjectWrapper) {
        this.zzc.zzb();
    }

    public final void zzi(IObjectWrapper iObjectWrapper) {
    }

    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zza.zzdt();
    }

    public final void zzk(IObjectWrapper iObjectWrapper, int i) {
    }

    public final void zzl(IObjectWrapper iObjectWrapper) {
    }

    public final void zzm(IObjectWrapper iObjectWrapper, zzbwo zzbwo) {
        this.zzd.zza(zzbwo);
    }

    public final void zzn(IObjectWrapper iObjectWrapper) {
        this.zzd.zza((zzbwo) null);
    }

    public final void zzo(IObjectWrapper iObjectWrapper) {
        this.zzc.zze();
    }

    public final void zzp(IObjectWrapper iObjectWrapper) {
        this.zzd.zzc();
    }
}
