package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhcz extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhcz zza;
    private static volatile zzhba zzb;
    private zzgzt zzc = zzbK();

    static {
        zzhcz zzhcz = new zzhcz();
        zza = zzhcz;
        zzgzh.zzbZ(zzhcz.class, zzhcz);
    }

    private zzhcz() {
    }

    public static zzhcy zzc() {
        return (zzhcy) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhcz zzhcz, zzhcx zzhcx) {
        zzhcx.getClass();
        zzgzt zzgzt = zzhcz.zzc;
        if (!zzgzt.zzc()) {
            zzhcz.zzc = zzgzh.zzbL(zzgzt);
        }
        zzhcz.zzc.add(zzhcx);
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhcx.class});
        } else if (ordinal == 3) {
            return new zzhcz();
        } else {
            if (ordinal == 4) {
                return new zzhcy((zzhda) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhcz.class) {
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
