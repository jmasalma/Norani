package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzvu extends zzyy {
    private final zzbm zza;

    public zzvu(zzyw zzyw, zzbm zzbm) {
        super(zzyw);
        this.zza = zzbm;
    }

    public final boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof zzvu)) {
            return false;
        }
        return this.zza.equals(((zzvu) obj).zza);
    }

    public final int hashCode() {
        return (super.hashCode() * 31) + this.zza.hashCode();
    }

    public final zzz zza(int i) {
        return this.zza.zzb(zzd().zze(i));
    }

    public final zzz zzb() {
        return this.zza.zzb(zzd().zzf());
    }

    public final zzbm zzc() {
        return this.zza;
    }
}
