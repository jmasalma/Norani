package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfie extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfie zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzfib zzd;

    static {
        zzfie zzfie = new zzfie();
        zza = zzfie;
        zzgzh.zzbZ(zzfie.class, zzfie);
    }

    private zzfie() {
    }

    public static zzfid zza() {
        return (zzfid) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzfie zzfie, zzfib zzfib) {
        zzfib.getClass();
        zzfie.zzd = zzfib;
        zzfie.zzc |= 1;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzfie();
        } else {
            if (ordinal == 4) {
                return new zzfid((zzfif) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfie.class) {
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
