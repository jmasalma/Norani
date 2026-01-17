package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
final class zzfvz extends zzfwc {
    final /* synthetic */ zzfvb zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfvz(zzfwe zzfwe, CharSequence charSequence, zzfvb zzfvb) {
        super(zzfwe, charSequence);
        this.zza = zzfvb;
    }

    public final int zzc(int i) {
        return ((zzfvf) this.zza).zza.end();
    }

    public final int zzd(int i) {
        Matcher matcher = ((zzfvf) this.zza).zza;
        if (matcher.find(i)) {
            return matcher.start();
        }
        return -1;
    }
}
