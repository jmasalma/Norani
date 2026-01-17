package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzath extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzath zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private long zze = -1;

    static {
        zzath zzath = new zzath();
        zza = zzath;
        zzgzh.zzbZ(zzath.class, zzath);
    }

    private zzath() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", zzasx.zza, "zze"});
        } else if (ordinal == 3) {
            return new zzath();
        } else {
            if (ordinal == 4) {
                return new zzatg((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzath.class) {
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
