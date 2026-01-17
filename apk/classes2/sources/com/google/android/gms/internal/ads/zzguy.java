package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzguy extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzguy zza;
    private static volatile zzhba zzb;
    private String zzc = "";

    static {
        zzguy zzguy = new zzguy();
        zza = zzguy;
        zzgzh.zzbZ(zzguy.class, zzguy);
    }

    private zzguy() {
    }

    public static zzguw zza() {
        return (zzguw) zza.zzaZ();
    }

    public static zzguy zzc() {
        return zza;
    }

    public static zzguy zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzguy) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzg(zzguy zzguy, String str) {
        str.getClass();
        zzguy.zzc = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzguy();
        } else {
            if (ordinal == 4) {
                return new zzguw((zzgux) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzguy.class) {
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

    public final String zzf() {
        return this.zzc;
    }
}
