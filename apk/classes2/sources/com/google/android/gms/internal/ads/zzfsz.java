package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfsz extends zzfuc {
    private String zza;
    private String zzb;

    zzfsz() {
    }

    public final zzfuc zza(String str) {
        this.zzb = str;
        return this;
    }

    public final zzfuc zzb(String str) {
        this.zza = str;
        return this;
    }

    public final zzfud zzc() {
        return new zzftb(this.zza, this.zzb, (zzfta) null);
    }
}
