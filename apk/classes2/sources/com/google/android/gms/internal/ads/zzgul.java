package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgul extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgul zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgub zzd;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzgul zzgul = new zzgul();
        zza = zzgul;
        zzgzh.zzbZ(zzgul.class, zzgul);
    }

    private zzgul() {
    }

    public static zzguk zzc() {
        return (zzguk) zza.zzaZ();
    }

    static /* synthetic */ void zzg(zzgul zzgul, zzgub zzgub) {
        zzgub.getClass();
        zzgul.zzd = zzgub;
        zzgul.zzc |= 1;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzgub zzb() {
        zzgub zzgub = this.zzd;
        return zzgub == null ? zzgub.zzd() : zzgub;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
        } else if (ordinal == 3) {
            return new zzgul();
        } else {
            if (ordinal == 4) {
                return new zzguk((zzgum) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgul.class) {
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

    public final zzgvf zzf() {
        zzgvf zzb2 = zzgvf.zzb(this.zzg);
        return zzb2 == null ? zzgvf.UNRECOGNIZED : zzb2;
    }

    public final boolean zzj() {
        return (this.zzc & 1) != 0;
    }

    public final int zzk() {
        int i = this.zze;
        int i2 = 2;
        if (i != 0) {
            i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3;
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
