package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgrx extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgrx zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;

    static {
        zzgrx zzgrx = new zzgrx();
        zza = zzgrx;
        zzgzh.zzbZ(zzgrx.class, zzgrx);
    }

    private zzgrx() {
    }

    public static zzgrv zzb() {
        return (zzgrv) zza.zzaZ();
    }

    public static zzgrx zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzgrx();
        } else {
            if (ordinal == 4) {
                return new zzgrv((zzgrw) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgrx.class) {
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
