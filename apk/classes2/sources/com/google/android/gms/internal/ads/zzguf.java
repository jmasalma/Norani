package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzguf extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzguf zza;
    private static volatile zzhba zzb;
    private String zzc = "";
    private zzgxz zzd = zzgxz.zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzguf zzguf = new zzguf();
        zza = zzguf;
        zzgzh.zzbZ(zzguf.class, zzguf);
    }

    private zzguf() {
    }

    public static zzgud zza() {
        return (zzgud) zza.zzaZ();
    }

    public static zzgud zzb(zzguf zzguf) {
        return (zzgud) zza.zzba(zzguf);
    }

    public static zzguf zzd() {
        return zza;
    }

    public static zzguf zzf(byte[] bArr, zzgyr zzgyr) throws zzgzw {
        return (zzguf) zzgzh.zzbx(zza, bArr, zzgyr);
    }

    static /* synthetic */ void zzk(zzguf zzguf, String str) {
        str.getClass();
        zzguf.zzc = str;
    }

    static /* synthetic */ void zzl(zzguf zzguf, zzgxz zzgxz) {
        zzgxz.getClass();
        zzguf.zzd = zzgxz;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzguf();
        } else {
            if (ordinal == 4) {
                return new zzgud((zzgue) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzguf.class) {
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

    public final zzgvf zzg() {
        zzgvf zzb2 = zzgvf.zzb(this.zze);
        return zzb2 == null ? zzgvf.UNRECOGNIZED : zzb2;
    }

    public final zzgxz zzh() {
        return this.zzd;
    }

    public final String zzi() {
        return this.zzc;
    }
}
