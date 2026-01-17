package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcis implements zzexa {
    private final zzcio zza;
    private Context zzb;
    private String zzc;

    /* synthetic */ zzcis(zzcio zzcio, zzcjs zzcjs) {
        this.zza = zzcio;
    }

    public final zzexb zzc() {
        zzhgz.zzc(this.zzb, Context.class);
        zzhgz.zzc(this.zzc, String.class);
        return new zzcit(this.zza, this.zzb, this.zzc);
    }

    public final /* bridge */ /* synthetic */ zzexa zza(String str) {
        str.getClass();
        String str2 = str;
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzexa zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
