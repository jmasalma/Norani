package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzay;
import com.google.android.gms.ads.internal.zzv;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzdfd implements zzcxm {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ VersionInfoParcel zzb;
    public final /* synthetic */ zzfca zzc;
    public final /* synthetic */ zzfcw zzd;

    public /* synthetic */ zzdfd(Context context, VersionInfoParcel versionInfoParcel, zzfca zzfca, zzfcw zzfcw) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfca;
        this.zzd = zzfcw;
    }

    public final void zzu() {
        zzay zzu = zzv.zzu();
        Context context = this.zza;
        zzfcw zzfcw = this.zzd;
        zzu.zzn(context, this.zzb.afmaVersion, this.zzc.zzC.toString(), zzfcw.zzf);
    }
}
