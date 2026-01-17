package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgiu {
    @Nullable
    private zzgiw zza;
    @Nullable
    private String zzb;
    @Nullable
    private zzgiv zzc;
    @Nullable
    private zzgga zzd;

    private zzgiu() {
        throw null;
    }

    /* synthetic */ zzgiu(zzgix zzgix) {
    }

    public final zzgiu zza(zzgga zzgga) {
        this.zzd = zzgga;
        return this;
    }

    public final zzgiu zzb(zzgiv zzgiv) {
        this.zzc = zzgiv;
        return this;
    }

    public final zzgiu zzc(String str) {
        this.zzb = str;
        return this;
    }

    public final zzgiu zzd(zzgiw zzgiw) {
        this.zza = zzgiw;
        return this;
    }

    public final zzgiy zze() throws GeneralSecurityException {
        if (this.zza == null) {
            this.zza = zzgiw.zzb;
        }
        if (this.zzb != null) {
            zzgiv zzgiv = this.zzc;
            if (zzgiv != null) {
                zzgga zzgga = this.zzd;
                if (zzgga == null) {
                    throw new GeneralSecurityException("dekParametersForNewKeys must be set");
                } else if (zzgga.zza()) {
                    throw new GeneralSecurityException("dekParametersForNewKeys must not have ID Requirements");
                } else if ((zzgiv.equals(zzgiv.zza) && (zzgga instanceof zzghm)) || ((zzgiv.equals(zzgiv.zzc) && (zzgga instanceof zzgid)) || ((zzgiv.equals(zzgiv.zzb) && (zzgga instanceof zzgka)) || ((zzgiv.equals(zzgiv.zzd) && (zzgga instanceof zzggr)) || ((zzgiv.equals(zzgiv.zze) && (zzgga instanceof zzghb)) || (zzgiv.equals(zzgiv.zzf) && (zzgga instanceof zzghx))))))) {
                    return new zzgiy(this.zza, this.zzb, this.zzc, this.zzd, (zzgix) null);
                } else {
                    String zzgiv2 = this.zzc.toString();
                    String valueOf = String.valueOf(this.zzd);
                    throw new GeneralSecurityException("Cannot use parsing strategy " + zzgiv2 + " when new keys are picked according to " + valueOf + ".");
                }
            } else {
                throw new GeneralSecurityException("dekParsingStrategy must be set");
            }
        } else {
            throw new GeneralSecurityException("kekUri must be set");
        }
    }
}
