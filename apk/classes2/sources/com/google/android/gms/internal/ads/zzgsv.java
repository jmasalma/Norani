package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgsv extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgsv zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;

    static {
        zzgsv zzgsv = new zzgsv();
        zza = zzgsv;
        zzgzh.zzbZ(zzgsv.class, zzgsv);
    }

    private zzgsv() {
    }

    public static zzgst zzb() {
        return (zzgst) zza.zzaZ();
    }

    public static zzgsv zzd() {
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
            return new zzgsv();
        } else {
            if (ordinal == 4) {
                return new zzgst((zzgsu) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgsv.class) {
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
