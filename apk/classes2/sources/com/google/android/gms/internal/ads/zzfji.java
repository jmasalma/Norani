package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfji extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfji zza;
    private static volatile zzhba zzb;
    private boolean zzc;
    private boolean zzd;

    static {
        zzfji zzfji = new zzfji();
        zza = zzfji;
        zzgzh.zzbZ(zzfji.class, zzfji);
    }

    private zzfji() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzfji();
        } else {
            if (ordinal == 4) {
                return new zzfjg((zzfjh) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfji.class) {
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
