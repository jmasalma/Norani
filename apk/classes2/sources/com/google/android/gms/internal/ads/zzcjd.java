package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcjd implements zzdtt {
    private final zzcio zza;
    private Context zzb;
    private zzble zzc;

    /* synthetic */ zzcjd(zzcio zzcio, zzcjs zzcjs) {
        this.zza = zzcio;
    }

    public final zzdtu zzc() {
        zzhgz.zzc(this.zzb, Context.class);
        zzhgz.zzc(this.zzc, zzble.class);
        return new zzcje(this.zza, this.zzb, this.zzc);
    }

    public final /* bridge */ /* synthetic */ zzdtt zza(zzble zzble) {
        zzble.getClass();
        zzble zzble2 = zzble;
        this.zzc = zzble;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzdtt zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
