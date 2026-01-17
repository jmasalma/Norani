package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zza;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzdnv implements Callable {
    /* access modifiers changed from: private */
    public final zza zza;
    /* access modifiers changed from: private */
    public final Context zzb;
    /* access modifiers changed from: private */
    public final zzdsj zzc;
    /* access modifiers changed from: private */
    public final zzeca zzd;
    /* access modifiers changed from: private */
    public final Executor zze;
    /* access modifiers changed from: private */
    public final zzavu zzf;
    /* access modifiers changed from: private */
    public final VersionInfoParcel zzg;
    /* access modifiers changed from: private */
    public final zzfjy zzh;
    /* access modifiers changed from: private */
    public final zzecl zzi;
    /* access modifiers changed from: private */
    public final zzfda zzj;

    public zzdnv(Context context, Executor executor, zzavu zzavu, VersionInfoParcel versionInfoParcel, zza zza2, zzcft zzcft, zzeca zzeca, zzfjy zzfjy, zzdsj zzdsj, zzecl zzecl, zzfda zzfda) {
        this.zzb = context;
        this.zze = executor;
        this.zzf = zzavu;
        this.zzg = versionInfoParcel;
        this.zza = zza2;
        this.zzd = zzeca;
        this.zzh = zzfjy;
        this.zzc = zzdsj;
        this.zzi = zzecl;
        this.zzj = zzfda;
    }

    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzdny zzdny = new zzdny(this);
        zzdny.zzk();
        return zzdny;
    }
}
