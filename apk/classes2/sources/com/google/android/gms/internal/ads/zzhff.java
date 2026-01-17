package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhff extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhff zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private int zze;

    static {
        zzhff zzhff = new zzhff();
        zza = zzhff;
        zzgzh.zzbZ(zzhff.class, zzhff);
    }

    private zzhff() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzgzn zzgzn = zzhfe.zza;
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", zzgzn, "zze", zzgzn});
        } else if (ordinal == 3) {
            return new zzhff();
        } else {
            if (ordinal == 4) {
                return new zzhfd((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhff.class) {
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
