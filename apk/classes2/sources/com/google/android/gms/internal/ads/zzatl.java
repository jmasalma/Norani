package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbcj;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzatl extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzatl zza;
    private static volatile zzhba zzb;
    private int zzc;
    private long zzd = -1;
    private int zze = zzbcj.zzq.zzf;

    static {
        zzatl zzatl = new zzatl();
        zza = zzatl;
        zzgzh.zzbZ(zzatl.class, zzatl);
    }

    private zzatl() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzc", "zzd", "zze", zzaty.zza});
        } else if (ordinal == 3) {
            return new zzatl();
        } else {
            if (ordinal == 4) {
                return new zzatk((zzaui) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzatl.class) {
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
