package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfvu extends zzfvn {
    private final Object zza;

    zzfvu(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfvu) {
            return this.zza.equals(((zzfvu) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String obj = this.zza.toString();
        return "Optional.of(" + obj + ")";
    }

    public final zzfvn zza(zzfve zzfve) {
        Object apply = zzfve.apply(this.zza);
        zzfvp.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfvu(apply);
    }

    public final Object zzb(Object obj) {
        return this.zza;
    }
}
