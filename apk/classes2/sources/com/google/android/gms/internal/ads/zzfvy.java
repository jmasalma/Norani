package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfvy extends zzfwc {
    final /* synthetic */ zzfva zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfvy(zzfwe zzfwe, CharSequence charSequence, zzfva zzfva) {
        super(zzfwe, charSequence);
        this.zza = zzfva;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(int i) {
        return i + 1;
    }

    /* access modifiers changed from: package-private */
    public final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfvp.zzb(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
