package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgus extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgus zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private zzgzt zzd = zzbK();

    static {
        zzgus zzgus = new zzgus();
        zza = zzgus;
        zzgzh.zzbZ(zzgus.class, zzgus);
    }

    private zzgus() {
    }

    public static zzguo zza() {
        return (zzguo) zza.zzaZ();
    }

    static /* synthetic */ void zzc(zzgus zzgus, zzguq zzguq) {
        zzguq.getClass();
        zzgzt zzgzt = zzgus.zzd;
        if (!zzgzt.zzc()) {
            zzgus.zzd = zzgzh.zzbL(zzgzt);
        }
        zzgus.zzd.add(zzguq);
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzguq.class});
        } else if (ordinal == 3) {
            return new zzgus();
        } else {
            if (ordinal == 4) {
                return new zzguo((zzgur) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgus.class) {
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
