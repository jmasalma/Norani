package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzetq implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    zzetq(zzgdy zzgdy, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgdy;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    public static /* synthetic */ zzetr zzc(zzetq zzetq) {
        int i;
        Context context = zzetq.zzb;
        boolean isCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
        zzv.zzr();
        boolean zzF = zzs.zzF(context);
        String str = zzetq.zzc.afmaVersion;
        zzv.zzr();
        boolean zzG = zzs.zzG();
        zzv.zzr();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new zzetr(isCallerInstantApp, zzF, str, zzG, i, DynamiteModule.getRemoteVersion(context, "com.google.android.gms.ads.dynamite"), DynamiteModule.getLocalVersion(context, "com.google.android.gms.ads.dynamite"), zzetq.zzd);
    }

    public final int zza() {
        return 35;
    }

    public final ListenableFuture zzb() {
        return this.zza.zzb(new zzetp(this));
    }
}
