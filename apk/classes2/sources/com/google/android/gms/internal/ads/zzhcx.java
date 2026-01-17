package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhcx extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhcx zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public long zzd;
    /* access modifiers changed from: private */
    public long zze;

    static {
        zzhcx zzhcx = new zzhcx();
        zza = zzhcx;
        zzgzh.zzbZ(zzhcx.class, zzhcx);
    }

    private zzhcx() {
    }

    public static zzhcw zzc() {
        return (zzhcw) zza.zzaZ();
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzhcx();
        } else {
            if (ordinal == 4) {
                return new zzhcw((zzhda) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhcx.class) {
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
