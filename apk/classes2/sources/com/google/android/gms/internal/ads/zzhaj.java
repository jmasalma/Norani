package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzhaj implements zzhaq {
    private final zzhaq[] zza;

    zzhaj(zzhaq... zzhaqArr) {
        this.zza = zzhaqArr;
    }

    public final zzhap zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            zzhaq zzhaq = this.zza[i];
            if (zzhaq.zzc(cls)) {
                return zzhaq.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.zza[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
