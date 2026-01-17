package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhgp implements zzhgr {
    private zzhha zza;

    public static void zza(zzhha zzhha, zzhha zzhha2) {
        zzhgp zzhgp = (zzhgp) zzhha;
        if (zzhgp.zza == null) {
            zzhgp.zza = zzhha2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzhha zzhha = this.zza;
        if (zzhha != null) {
            return zzhha.zzb();
        }
        throw new IllegalStateException();
    }
}
