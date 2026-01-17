package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
final class zzfqp extends zzfqx {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfqp() {
    }

    public final zzfqx zza(String str) {
        this.zza = "";
        return this;
    }

    public final zzfqx zzb(boolean z) {
        this.zzb = 1;
        return this;
    }

    public final zzfqy zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfqr(this.zza, false, this.zzc, (zzfqn) null, (zzfqo) null, this.zzd, (zzfqq) null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* access modifiers changed from: package-private */
    public final zzfqx zzd(int i) {
        this.zzc = i;
        return this;
    }

    public final zzfqx zze(int i) {
        this.zzd = 1;
        return this;
    }
}
