package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzau;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final /* synthetic */ class zzcun implements zzfve {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ VersionInfoParcel zzb;
    public final /* synthetic */ zzfcw zzc;

    public /* synthetic */ zzcun(Context context, VersionInfoParcel versionInfoParcel, zzfcw zzfcw) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzfcw;
    }

    public final Object apply(Object obj) {
        zzfca zzfca = (zzfca) obj;
        zzau zzau = new zzau(this.zza);
        zzau.zzp(zzfca.zzB);
        zzau.zzq(zzfca.zzC.toString());
        zzau.zzo(this.zzb.afmaVersion);
        zzau.zzn(this.zzc.zzf);
        return zzau;
    }
}
