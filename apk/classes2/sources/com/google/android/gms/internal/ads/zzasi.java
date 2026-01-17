package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzasi extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzasi zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd = 2;

    static {
        zzasi zzasi = new zzasi();
        zza = zzasi;
        zzgzh.zzbZ(zzasi.class, zzasi);
    }

    private zzasi() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b᠌\u0000", new Object[]{"zzc", "zzd", zzasj.zza});
        } else if (ordinal == 3) {
            return new zzasi();
        } else {
            if (ordinal == 4) {
                return new zzash((zzasm) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzasi.class) {
                        zzhba = zzb;
                        if (zzhba == null) {
                            zzhba = new zzgzc(zza);
                            zzb = zzhba;
                        }
                    }
                }
                return zzhba;
            }
            throw null;
        }
    }
}
