package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfr implements zzfwh {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzchd zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzavu zzf;
    public final /* synthetic */ zzbel zzg;
    public final /* synthetic */ VersionInfoParcel zzh;
    public final /* synthetic */ zzn zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzbcc zzk;
    public final /* synthetic */ zzfca zzl;
    public final /* synthetic */ zzfcd zzm;
    public final /* synthetic */ zzfda zzn;
    public final /* synthetic */ zzdsj zzo;
    public final /* synthetic */ zzecl zzp;

    public /* synthetic */ zzcfr(Context context, zzchd zzchd, String str, boolean z, boolean z2, zzavu zzavu, zzbel zzbel, VersionInfoParcel versionInfoParcel, zzbdt zzbdt, zzn zzn2, zza zza2, zzbcc zzbcc, zzfca zzfca, zzfcd zzfcd, zzfda zzfda, zzdsj zzdsj, zzecl zzecl) {
        this.zza = context;
        this.zzb = zzchd;
        this.zzc = str;
        this.zzd = z;
        this.zze = z2;
        this.zzf = zzavu;
        this.zzg = zzbel;
        this.zzh = versionInfoParcel;
        this.zzi = zzn2;
        this.zzj = zza2;
        this.zzk = zzbcc;
        this.zzl = zzfca;
        this.zzm = zzfcd;
        this.zzn = zzfda;
        this.zzo = zzdsj;
        this.zzp = zzecl;
    }

    public final Object zza() {
        zzchd zzchd = this.zzb;
        String str = this.zzc;
        boolean z = this.zzd;
        zzbcc zzbcc = this.zzk;
        boolean z2 = this.zze;
        zzavu zzavu = this.zzf;
        zzfca zzfca = this.zzl;
        zzbel zzbel = this.zzg;
        zzn zzn2 = this.zzi;
        zzfcd zzfcd = this.zzm;
        Context context = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzh;
        zza zza2 = this.zzj;
        zzfda zzfda = this.zzn;
        zzdsj zzdsj = this.zzo;
        zza zza3 = zza2;
        zzecl zzecl = this.zzp;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = zzcgf.zza;
            zzcgf zzcgf = r2;
            zzdsj zzdsj2 = zzdsj;
            zzfcd zzfcd2 = zzfcd;
            zza zza4 = zza3;
            zzfca zzfca2 = zzfca;
            zzcgf zzcgf2 = new zzcgf(new zzchc(context), zzchd, str, z, z2, zzavu, zzbel, versionInfoParcel, (zzbdt) null, zzn2, zza4, zzbcc, zzfca2, zzfcd2, zzfda);
            zzcfy zzcfy = new zzcfy(zzcgf, zzdsj2);
            boolean z3 = z2;
            zzcfy.setWebViewClient(zzv.zzs().zzc(zzcfy, zzbcc, z3, zzecl));
            zzcfy.setWebChromeClient(new zzcff(zzcfy));
            return zzcfy;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
