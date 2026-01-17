package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgsj extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgsj zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgsm zzd;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzgsj zzgsj = new zzgsj();
        zza = zzgsj;
        zzgzh.zzbZ(zzgsj.class, zzgsj);
    }

    private zzgsj() {
    }

    public static zzgsh zzb() {
        return (zzgsh) zza.zzaZ();
    }

    public static zzgsj zzd() {
        return zza;
    }

    static /* synthetic */ void zzh(zzgsj zzgsj, zzgsm zzgsm) {
        zzgsm.getClass();
        zzgsj.zzd = zzgsm;
        zzgsj.zzc |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgsj();
        } else {
            if (ordinal == 4) {
                return new zzgsh((zzgsi) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgsj.class) {
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
        zzgsm zzgsm = this.zzd;
        return zzgsm == null ? zzgsm.zzd() : zzgsm;
    }
}
