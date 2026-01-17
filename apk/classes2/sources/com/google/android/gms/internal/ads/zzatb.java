package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzatb extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzatb zza;
    private static volatile zzhba zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbcj.zzq.zzf;
    private int zzf = zzbcj.zzq.zzf;

    static {
        zzatb zzatb = new zzatb();
        zza = zzatb;
        zzgzh.zzbZ(zzatb.class, zzatb);
    }

    private zzatb() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            zzgzn zzgzn = zzaty.zza;
            return zzbQ(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzc", "zzd", "zze", zzgzn, "zzf", zzgzn});
        } else if (ordinal == 3) {
            return new zzatb();
        } else {
            if (ordinal == 4) {
                return new zzata((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzatb.class) {
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
