package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgun extends zzgzh implements zzhat {
    /* access modifiers changed from: private */
    public static final zzgun zza;
    private static volatile zzhba zzb;
    /* access modifiers changed from: private */
    public int zzc;
    private zzgzt zzd = zzbK();

    static {
        zzgun zzgun = new zzgun();
        zza = zzgun;
        zzgzh.zzbZ(zzgun.class, zzgun);
    }

    private zzgun() {
    }

    public static zzguj zzc() {
        return (zzguj) zza.zzaZ();
    }

    public static zzgun zzg(InputStream inputStream, zzgyr zzgyr) throws IOException {
        return (zzgun) zzgzh.zzbu(zza, inputStream, zzgyr);
    }

    static /* synthetic */ void zzi(zzgun zzgun, zzgul zzgul) {
        zzgul.getClass();
        zzgzt zzgzt = zzgun.zzd;
        if (!zzgzt.zzc()) {
            zzgun.zzd = zzgzh.zzbL(zzgzt);
        }
        zzgun.zzd.add(zzgul);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzgul zzd(int i) {
        return (zzgul) this.zzd.get(i);
    }

    /* access modifiers changed from: protected */
    public final Object zzdd(zzgzg zzgzg, Object obj, Object obj2) {
        int ordinal = zzgzg.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgul.class});
        } else if (ordinal == 3) {
            return new zzgun();
        } else {
            if (ordinal == 4) {
                return new zzguj((zzgum) null);
            }
            if (ordinal == 5) {
                return zza;
            }
            if (ordinal == 6) {
                zzhba zzhba = zzb;
                if (zzhba == null) {
                    synchronized (zzgun.class) {
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

    public final List zzh() {
        return this.zzd;
    }
}
