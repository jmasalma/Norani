package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjk implements zzfbt {
    private final zzcio zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcjk(zzcio zzcio, zzcjs zzcjs) {
        this.zza = zzcio;
    }

    public final /* synthetic */ zzfbt zza(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfbu zzc() {
        zzhgz.zzc(this.zzb, Context.class);
        return new zzcjl(this.zza, this.zzb, this.zzc);
    }

    public final /* bridge */ /* synthetic */ zzfbt zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
