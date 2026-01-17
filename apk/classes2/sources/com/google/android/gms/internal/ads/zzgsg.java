package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgsg extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgsg zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private zzgsm zze;
    /* access modifiers changed from: private */
    public zzgxz zzf = zzgxz.zzb;

    static {
        zzgsg zzgsg = new zzgsg();
        zza = zzgsg;
        zzgzh.zzbZ(zzgsg.class, zzgsg);
    }

    private zzgsg() {
    }

    public static zzgse zzb() {
        return (zzgse) zza.zzaZ();
    }

    public static zzgsg zzd() {
        return zza;
    }

    static /* synthetic */ void zzi(zzgsg zzgsg, zzgsm zzgsm) {
        zzgsm.getClass();
        zzgsg.zze = zzgsm;
        zzgsg.zzc |= 1;
    }

    public final int zza() {
        return this.zzd;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzc", "zzd", "zze", "zzf"});
        } else if (ordinal == 3) {
            return new zzgsg();
        } else {
            if (ordinal == 4) {
                return new zzgse((zzgsf) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgsg.class) {
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

    public final zzgsm zzf() {
        zzgsm zzgsm = this.zze;
        return zzgsm == null ? zzgsm.zzd() : zzgsm;
    }

    public final zzgxz zzg() {
        return this.zzf;
    }
}
