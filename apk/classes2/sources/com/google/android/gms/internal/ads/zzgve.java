package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgve extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgve zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";
    private zzguf zze;

    static {
        zzgve zzgve = new zzgve();
        zza = zzgve;
        zzgzh.zzbZ(zzgve.class, zzgve);
    }

    private zzgve() {
    }

    public static zzgvc zzb() {
        return (zzgvc) zza.zzaZ();
    }

    public static zzgve zzd() {
        return zza;
    }

    public static zzgve zzf(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgve) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzh(zzgve zzgve, zzguf zzguf) {
        zzguf.getClass();
        zzgve.zze = zzguf;
        zzgve.zzc |= 1;
    }

    static /* synthetic */ void zzi(zzgve zzgve, String str) {
        str.getClass();
        zzgve.zzd = str;
    }

    public final zzguf zza() {
        zzguf zzguf = this.zze;
        return zzguf == null ? zzguf.zzd() : zzguf;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgve();
        } else {
            if (ordinal == 4) {
                return new zzgvc((zzgvd) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgve.class) {
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

    public final String zzg() {
        return this.zzd;
    }
}
