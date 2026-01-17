package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfig extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfig zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public zzgzt zzc = zzbK();

    static {
        zzfig zzfig = new zzfig();
        zza = zzfig;
        zzgzh.zzbZ(zzfig.class, zzfig);
    }

    private zzfig() {
    }

    public static zzfic zzb() {
        return (zzfic) zza.zzaZ();
    }

    static /* synthetic */ void zzd(zzfig zzfig, zzfie zzfie) {
        zzfie.getClass();
        zzgzt zzgzt = zzfig.zzc;
        if (!zzgzt.zzc()) {
            zzfig.zzc = zzgzh.zzbL(zzgzt);
        }
        zzfig.zzc.add(zzfie);
    }

    public final int zza() {
        return this.zzc.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzfie.class});
        } else if (ordinal == 3) {
            return new zzfig();
        } else {
            if (ordinal == 4) {
                return new zzfic((zzfif) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfig.class) {
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
