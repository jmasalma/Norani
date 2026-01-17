package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzgil extends zzgfz {
    private final zzgin zza;
    private final zzgxe zzb;
    @Nullable
    private final Integer zzc;

    private zzgil(zzgin zzgin, zzgxe zzgxe, @Nullable Integer num) {
        this.zza = zzgin;
        this.zzb = zzgxe;
        this.zzc = num;
    }

    public static zzgil zzc(zzgin zzgin, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxe;
        if (zzgin.zzb() == zzgim.zza) {
            if (num != null) {
                zzgxe = zzgxe.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new GeneralSecurityException("For given Variant TINK the value of idRequirement must be non-null");
            }
        } else if (zzgin.zzb() != zzgim.zzb) {
            throw new GeneralSecurityException("Unknown Variant: ".concat(zzgin.zzb().toString()));
        } else if (num == null) {
            zzgxe = zzgxe.zzb(new byte[0]);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        return new zzgil(zzgin, zzgxe, num);
    }

    public final /* synthetic */ zzgfm zza() {
        return this.zza;
    }

    public final zzgxe zzb() {
        return this.zzb;
    }

    public final zzgin zzd() {
        return this.zza;
    }

    public final Integer zze() {
        return this.zzc;
    }
}
