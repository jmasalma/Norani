package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgtx extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgtx zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;
    /* access modifiers changed from: private */
    public int zzd;

    static {
        zzgtx zzgtx = new zzgtx();
        zza = zzgtx;
        zzgzh.zzbZ(zzgtx.class, zzgtx);
    }

    private zzgtx() {
    }

    public static zzgtv zzc() {
        return (zzgtv) zza.zzaZ();
    }

    public static zzgtx zzf() {
        return zza;
    }

    public final int zza() {
        return this.zzd;
    }

    public final zzgto zzb() {
        int i = this.zzc;
        zzgto zzgto = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzgto.SHA224 : zzgto.SHA512 : zzgto.SHA256 : zzgto.SHA384 : zzgto.SHA1 : zzgto.UNKNOWN_HASH;
        return zzgto == null ? zzgto.UNRECOGNIZED : zzgto;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzgtx();
        } else {
            if (ordinal == 4) {
                return new zzgtv((zzgtw) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgtx.class) {
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
