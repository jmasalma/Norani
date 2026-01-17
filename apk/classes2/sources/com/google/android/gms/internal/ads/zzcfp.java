package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzn;
import com.google.android.gms.ads.internal.zzv;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcfp implements zzgct {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzavu zzb;
    public final /* synthetic */ VersionInfoParcel zzc;
    public final /* synthetic */ zza zzd;
    public final /* synthetic */ zzecl zze;
    public final /* synthetic */ zzfda zzf;
    public final /* synthetic */ zzdsj zzg;
    public final /* synthetic */ String zzh;

    public /* synthetic */ zzcfp(Context context, zzavu zzavu, VersionInfoParcel versionInfoParcel, zza zza2, zzecl zzecl, zzfda zzfda, zzdsj zzdsj, String str) {
        this.zza = context;
        this.zzb = zzavu;
        this.zzc = versionInfoParcel;
        this.zzd = zza2;
        this.zze = zzecl;
        this.zzf = zzfda;
        this.zzg = zzdsj;
        this.zzh = str;
    }

    public final ListenableFuture zza() {
        zzv.zzB();
        Context context = this.zza;
        zzecl zzecl = this.zze;
        zza zza2 = this.zzd;
        zzcfg zza3 = zzcft.zza(context, zzchd.zza(), "", false, false, this.zzb, (zzbel) null, this.zzc, (zzbdt) null, (zzn) null, zza2, zzbcc.zza(), (zzfca) null, (zzfcd) null, zzecl, this.zzf, this.zzg);
        zzcaj zza4 = zzcaj.zza(zza3);
        zza3.zzN().zzC(new zzcfq(zza4));
        zza3.loadUrl(this.zzh);
        return zza4;
    }
}
