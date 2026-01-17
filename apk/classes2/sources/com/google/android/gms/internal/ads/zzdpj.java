package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdpj {
    private final Context zza;
    private final zzavu zzb;
    private final zzbel zzc;
    private final VersionInfoParcel zzd;
    private final zza zze;
    private final zzbcc zzf;
    /* access modifiers changed from: private */
    public final zzcyv zzg;
    private final zzecl zzh;
    private final zzfda zzi;
    private final zzdsj zzj;

    public zzdpj(zzcft zzcft, Context context, zzavu zzavu, zzbel zzbel, VersionInfoParcel versionInfoParcel, zza zza2, zzbcc zzbcc, zzcyv zzcyv, zzecl zzecl, zzfda zzfda, zzdsj zzdsj) {
        this.zza = context;
        this.zzb = zzavu;
        this.zzc = zzbel;
        this.zzd = versionInfoParcel;
        this.zze = zza2;
        this.zzf = zzbcc;
        this.zzg = zzcyv;
        this.zzh = zzecl;
        this.zzi = zzfda;
        this.zzj = zzdsj;
    }

    public final zzcfg zza(zzr zzr, zzfca zzfca, zzfcd zzfcd) throws zzcfs {
        zzchd zzc2 = zzchd.zzc(zzr);
        String str = zzr.zza;
        zzdoy zzdoy = r1;
        zzdoy zzdoy2 = new zzdoy(this);
        zzecl zzecl = this.zzh;
        zzfda zzfda = this.zzi;
        zzdsj zzdsj = this.zzj;
        zza zza2 = this.zze;
        zzbcc zzbcc = this.zzf;
        zzavu zzavu = this.zzb;
        zzbel zzbel = this.zzc;
        VersionInfoParcel versionInfoParcel = this.zzd;
        return zzcft.zza(this.zza, zzc2, str, false, false, zzavu, zzbel, versionInfoParcel, (zzbdt) null, zzdoy, zza2, zzbcc, zzfca, zzfcd, zzecl, zzfda, zzdsj);
    }
}
