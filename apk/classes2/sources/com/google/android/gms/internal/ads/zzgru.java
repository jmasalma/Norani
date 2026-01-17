package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgru extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgru zza;
    private static volatile zzhba zzb;
    private int zzc;
    /* access modifiers changed from: private */
    public int zzd;
    private zzgrx zze;

    static {
        zzgru zzgru = new zzgru();
        zza = zzgru;
        zzgzh.zzbZ(zzgru.class, zzgru);
    }

    private zzgru() {
    }

    public static zzgrs zzb() {
        return (zzgrs) zza.zzaZ();
    }

    public static zzgru zzd(zzgxz zzgxz, zzgyr zzgyr) throws zzgzw {
        return (zzgru) zzgzh.zzbr(zza, zzgxz, zzgyr);
    }

    static /* synthetic */ void zzh(zzgru zzgru, zzgrx zzgrx) {
        zzgrx.getClass();
        zzgru.zze = zzgrx;
        zzgru.zzc |= 1;
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
            return zzbQ(zza, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzc", "zzd", "zze"});
        } else if (ordinal == 3) {
            return new zzgru();
        } else {
            if (ordinal == 4) {
                return new zzgrs((zzgrt) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgru.class) {
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

    public final zzgrx zzf() {
        zzgrx zzgrx = this.zze;
        return zzgrx == null ? zzgrx.zzd() : zzgrx;
    }
}
