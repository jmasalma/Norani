package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzbk;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzcuf implements zzcza, zzdep {
    private final Context zza;
    private final zzfcw zzb;
    private final VersionInfoParcel zzc;
    private final zzg zzd;
    private final zzdun zze;
    private final zzfhx zzf;
    private final zzdvi zzg;

    public zzcuf(Context context, zzfcw zzfcw, VersionInfoParcel versionInfoParcel, zzg zzg2, zzdun zzdun, zzfhx zzfhx, zzdvi zzdvi) {
        this.zza = context;
        this.zzb = zzfcw;
        this.zzc = versionInfoParcel;
        this.zzd = zzg2;
        this.zze = zzdun;
        this.zzf = zzfhx;
        this.zzg = zzdvi;
    }

    private final void zzc() {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzeo)).booleanValue()) {
            zzg zzg2 = this.zzd;
            Context context = this.zza;
            VersionInfoParcel versionInfoParcel = this.zzc;
            zzfcw zzfcw = this.zzb;
            zzfhx zzfhx = this.zzf;
            zzdvi zzdvi = this.zzg;
            String str = zzfcw.zzf;
            zzbzm zzg3 = zzg2.zzg();
            zzv.zza().zze(context, versionInfoParcel, str, zzg3, zzfhx, zzdvi.zzq());
        }
        this.zze.zzr();
    }

    public final void zzdn(zzbvq zzbvq) {
        zzc();
    }

    public final void zzdo(zzfcn zzfcn) {
    }

    public final void zze(zzbk zzbk) {
        if (((Boolean) zzbd.zzc().zzb(zzbde.zzep)).booleanValue()) {
            zzc();
        }
    }

    public final void zzf(String str) {
    }
}
