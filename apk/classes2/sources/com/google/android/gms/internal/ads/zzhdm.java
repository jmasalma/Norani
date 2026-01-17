package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzhdm extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzhdm zza;
    private static volatile zzhba zzb;
    private int zzc;
    private String zzd = "";

    static {
        zzhdm zzhdm = new zzhdm();
        zza = zzhdm;
        zzgzh.zzbZ(zzhdm.class, zzhdm);
    }

    private zzhdm() {
    }

    public static zzhdl zzc() {
        return (zzhdl) zza.zzaZ();
    }

    static /* synthetic */ void zzf(zzhdm zzhdm, String str) {
        zzhdm.zzc |= 1;
        zzhdm.zzd = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzc", "zzd"});
        } else if (ordinal == 3) {
            return new zzhdm();
        } else {
            if (ordinal == 4) {
                return new zzhdl((zzhfx) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzhdm.class) {
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
