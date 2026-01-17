package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzqn extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzz zzc;

    public zzqn(int i, zzz zzz, boolean z) {
        super("AudioTrack write failed: " + i);
        this.zzb = z;
        this.zza = i;
        this.zzc = zzz;
    }
}
