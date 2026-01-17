package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfiz extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfiz zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private int zze;
    private String zzf = "";

    static {
        zzfiz zzfiz = new zzfiz();
        zza = zzfiz;
        zzgzh.zzbZ(zzfiz.class, zzfiz);
    }

    private zzfiz() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f\u0004Ȉ", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzfiz();
        } else {
            if (ordinal == 4) {
                return new zzfix((zzfiy) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfiz.class) {
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
