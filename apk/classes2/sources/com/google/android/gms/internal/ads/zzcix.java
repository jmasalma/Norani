package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzr;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzcix implements zzeyo {
    private final zzcio zza;
    private Context zzb;
    private String zzc;
    private zzr zzd;

    /* synthetic */ zzcix(zzcio zzcio, zzcjs zzcjs) {
        this.zza = zzcio;
    }

    public final zzeyp zzd() {
        zzhgz.zzc(this.zzb, Context.class);
        zzhgz.zzc(this.zzc, String.class);
        zzhgz.zzc(this.zzd, zzr.class);
        return new zzciy(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final /* bridge */ /* synthetic */ zzeyo zza(zzr zzr) {
        zzr.getClass();
        zzr zzr2 = zzr;
        this.zzd = zzr;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzeyo zzb(String str) {
        str.getClass();
        String str2 = str;
        this.zzc = str;
        return this;
    }

    public final /* bridge */ /* synthetic */ zzeyo zzc(Context context) {
        context.getClass();
        Context context2 = context;
        this.zzb = context;
        return this;
    }
}
