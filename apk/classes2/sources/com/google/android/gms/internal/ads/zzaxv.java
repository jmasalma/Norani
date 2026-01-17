package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
public final class zzaxv extends zzayk {
    private final zzawa zzh;
    private final long zzi;
    private final long zzj;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzaxv(zzawx zzawx, String str, String str2, zzast zzast, int i, int i2, zzawa zzawa, long j, long j2) {
        super(zzawx, "Q2alXHIIp2vvtZN4ZNw4W3dXvS5FZxkSx8F3noC2XP6gq0/XB0ulYQV32h8ZSW0i", "bHzouddPHTqhUNsOeni/FRK++KVVMe5yU+yUqilZ/gg=", zzast, i, 11);
        this.zzh = zzawa;
        this.zzi = j;
        this.zzj = j2;
    }

    /* access modifiers changed from: protected */
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        zzawa zzawa = this.zzh;
        if (zzawa != null) {
            zzavy zzavy = new zzavy((String) this.zze.invoke((Object) null, new Object[]{zzawa.zzb(), Long.valueOf(this.zzi), Long.valueOf(this.zzj)}));
            zzast zzast = this.zzd;
            synchronized (zzast) {
                zzast.zzx(zzavy.zza.longValue());
                if (zzavy.zzb.longValue() >= 0) {
                    zzast.zzO(zzavy.zzb.longValue());
                }
                if (zzavy.zzc.longValue() >= 0) {
                    zzast.zzf(zzavy.zzc.longValue());
                }
            }
        }
    }
}
