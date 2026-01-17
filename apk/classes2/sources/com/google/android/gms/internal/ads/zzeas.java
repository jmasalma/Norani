package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzeas {
    private final zzeao zza;
    private final zzgdy zzb;

    public zzeas(zzeao zzeao, zzgdy zzgdy) {
        this.zza = zzeao;
        this.zzb = zzgdy;
    }

    public final void zza(zzfge zzfge) {
        zzeao zzeao = this.zza;
        Objects.requireNonNull(zzeao);
        zzeaq zzeaq = new zzeaq(zzeao);
        zzgdy zzgdy = this.zzb;
        zzgdn.zzr(zzgdy.zzb(zzeaq), new zzear(this, zzfge), zzgdy);
    }
}
