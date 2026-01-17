package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfim extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfim zza;
    private static volatile zzhba zzb;
    private String zzc = "";
    private int zzd;

    static {
        zzfim zzfim = new zzfim();
        zza = zzfim;
        zzgzh.zzbZ(zzfim.class, zzfim);
    }

    private zzfim() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0004", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzfim();
        } else {
            if (ordinal == 4) {
                return new zzfik((zzfil) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfim.class) {
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
