package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzauf extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzauf zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzauf zzauf = new zzauf();
        zza = zzauf;
        zzgzh.zzbZ(zzauf.class, zzauf);
    }

    private zzauf() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzauf();
        } else {
            if (ordinal == 4) {
                return new zzaue((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzauf.class) {
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
