package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzasw extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzasw zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;

    static {
        zzasw zzasw = new zzasw();
        zza = zzasw;
        zzgzh.zzbZ(zzasw.class, zzasw);
    }

    private zzasw() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzc", "zzd", zzasz.zza});
        } else if (ordinal == 3) {
            return new zzasw();
        } else {
            if (ordinal == 4) {
                return new zzasv((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzasw.class) {
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
