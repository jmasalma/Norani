package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzfij extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzfij zza;
    private static volatile zzhba zzb;
    private String zzc = "";

    static {
        zzfij zzfij = new zzfij();
        zza = zzfij;
        zzgzh.zzbZ(zzfij.class, zzfij);
    }

    private zzfij() {
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzc"});
        } else if (ordinal == 3) {
            return new zzfij();
        } else {
            if (ordinal == 4) {
                return new zzfih((zzfii) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzfij.class) {
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
