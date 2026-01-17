package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzbyh {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzbyo zzd;

    private zzbyh() {
        throw null;
    }

    /* synthetic */ zzbyh(zzbyj zzbyj) {
    }

    public final zzbyh zza(zzg zzg) {
        zzg zzg2 = zzg;
        this.zzc = zzg;
        return this;
    }

    public final zzbyh zzd(zzbyo zzbyo) {
        zzbyo zzbyo2 = zzbyo;
        this.zzd = zzbyo;
        return this;
    }

    public final zzbyp zze() {
        zzhgz.zzc(this.zza, Context.class);
        zzhgz.zzc(this.zzb, Clock.class);
        zzhgz.zzc(this.zzc, zzg.class);
        zzhgz.zzc(this.zzd, zzbyo.class);
        return new zzbyi(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzbyh zzb(Context context) {
        context.getClass();
        Context context2 = context;
        this.zza = context;
        return this;
    }

    public final zzbyh zzc(Clock clock) {
        clock.getClass();
        Clock clock2 = clock;
        this.zzb = clock;
        return this;
    }
}
